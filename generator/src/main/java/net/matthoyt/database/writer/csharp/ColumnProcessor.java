package net.matthoyt.database.writer.csharp;

import net.matthoyt.database.writer.Column;
import net.matthoyt.database.writer.DbGen;
import net.matthoyt.database.writer.Helpers;
import net.matthoyt.database.writer.SqlTranslation;

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
    public static CsharpModel processColumns(CsharpModel model, DbGen dbGen)
    {
        List<CsharpColumn> csharpColumns = new ArrayList<>(dbGen.columns.length);
        List<CsharpColumn> insertColumns = new ArrayList<>(dbGen.columns.length);
        List<CsharpColumn> updateColumns = new ArrayList<>(dbGen.columns.length);
        for (Column column : dbGen.columns)
        {
            CsharpColumn csharpColumn = new CsharpColumn();
            csharpColumns.add(csharpColumn);
            csharpColumn.name = NameCleaner.cleanName(column.name);
            csharpColumn.rawName = column.name;
            csharpColumn.isAutoIncrement = column.isAutoIncrement;
            csharpColumn.isReadOnly = column.isReadOnly;
            csharpColumn.isPrimaryKey = dbGen.primaryKeys.contains(column.name);
            if (dbGen.primaryKeys.contains(column.name))
            {
                model.primaryKey = csharpColumn;
            }
            csharpColumn.isNullable = column.isNullable;
            SqlTranslation dataType = SqlToCsharpTypes.SqlTypeToDatType(column.type);
            SqlTranslation readFunction = SqlToCsharpTypes.SqlTypeToRead(column.type);
            if (column.isNullable)
            {
                csharpColumn.dataType = dataType.nullableType;
                csharpColumn.rawDataType = dataType.valueType;
                csharpColumn.readFunction = readFunction.nullableType;
            } else
            {
                csharpColumn.dataType = dataType.valueType;
                csharpColumn.rawDataType = dataType.valueType;
                csharpColumn.readFunction = readFunction.valueType;
            }
            if (dbGen.enumModels.containsKey(column.name))
            {
                csharpColumn.dataType = Helpers.concatCbased(dbGen.enumModels.get(column.name));
                csharpColumn.castType = true;
                if (column.isNullable)
                {
                    csharpColumn.dataType += "?";
                }
            }
            csharpColumn.offset = column.offset;
            if (!column.isAutoIncrement && column.isWriteAble)
            {
                insertColumns.add(csharpColumn);
                if (!dbGen.primaryKeys.contains(column.name))
                {
                    updateColumns.add(csharpColumn);
                }
            }
        }
        model.columns = csharpColumns.toArray(new CsharpColumn[csharpColumns.size()]);
        model.insertColumns = insertColumns.toArray(new CsharpColumn[insertColumns.size()]);
        model.updateColumns = updateColumns.toArray(new CsharpColumn[updateColumns.size()]);
        return model;
    }
}
