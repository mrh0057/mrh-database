package net.matthoyt.database.writer.java;

import net.matthoyt.database.writer.Column;
import net.matthoyt.database.writer.DbGen;
import net.matthoyt.database.writer.Helpers;
import net.matthoyt.database.writer.SqlTranslation;
import net.matthoyt.database.writer.csharp.NameCleaner;

import java.util.ArrayList;
import java.util.List;

public class ColumnProcessor
{
    /**
     * Used to process the columns for the dbgen information.
     *
     * @param dbGen The config generation information.
     * @return The columns to generate.
     */
    public static JavaModel processColumns(JavaModel model, DbGen dbGen)
    {
        List<JavaColumn> csharpColumns = new ArrayList<>(dbGen.columns.length);
        List<JavaColumn> insertColumns = new ArrayList<>(dbGen.columns.length);
        List<JavaColumn> updateColumns = new ArrayList<>(dbGen.columns.length);
        int autoCount = 0;
        for (Column column : dbGen.columns)
        {
            JavaColumn javaColumn = new JavaColumn();
            csharpColumns.add(javaColumn);
            javaColumn.name = NameCleaner.cleanName(column.name);
            javaColumn.fieldName = fieldName(javaColumn.name);
            javaColumn.rawName = column.name;
            javaColumn.isAutoIncrement = column.isAutoIncrement;
            javaColumn.isReadOnly = column.isReadOnly;
            javaColumn.isPrimaryKey = dbGen.primaryKeys.contains(column.name);
            if (dbGen.primaryKeys.contains(column.name))
            {
                model.primaryKey = javaColumn;
                javaColumn.updateOffset = dbGen.columns.length;
            } else {
                javaColumn.updateOffset = column.offset - 1;
            }
            javaColumn.isNullable = column.isNullable;
            SqlTranslation dataType = SqlToJavaTypes.SqlTypeToDatType(column.type);
            SqlTranslation readFunction = SqlToJavaTypes.SqlTypeToRead(column.type);
            javaColumn.sqlType = dataType.javaSqlType;
            if (column.isNullable)
            {
                javaColumn.dataType = dataType.nullableType;
                javaColumn.rawDataType = dataType.valueType;
                javaColumn.readFunction = readFunction.nullableType;
            } else
            {
                javaColumn.dataType = dataType.valueType;
                javaColumn.rawDataType = dataType.valueType;
                javaColumn.readFunction = readFunction.valueType;
            }
            if (dbGen.enumModels.containsKey(column.name))
            {
                javaColumn.dataType = Helpers.concatCbased(dbGen.enumModels.get(column.name));
                javaColumn.castType = true;
            }
            javaColumn.offset = column.offset;
            if (column.isAutoIncrement) {
                autoCount++;
            } else {
                javaColumn.insertOffset = column.offset - autoCount;
            }
            if (!column.isAutoIncrement && column.isWriteAble)
            {
                insertColumns.add(javaColumn);
                if (!dbGen.primaryKeys.contains(column.name))
                {
                    updateColumns.add(javaColumn);
                }
            }
        }
        model.columns = csharpColumns.toArray(new JavaColumn[csharpColumns.size()]);
        model.insertColumns = insertColumns.toArray(new JavaColumn[insertColumns.size()]);
        model.updateColumns = updateColumns.toArray(new JavaColumn[updateColumns.size()]);
        return model;
    }

    private static String fieldName(String name)
    {
        if (name.length() == 0)
        {
            return name;
        }
        if (name.length() == 1)
        {
            return name.toLowerCase();
        }
        return Character.toLowerCase(name.charAt(0)) + name.substring(1);
    }
}
