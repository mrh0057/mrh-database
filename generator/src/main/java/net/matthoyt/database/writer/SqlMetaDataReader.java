package net.matthoyt.database.writer;

import net.matthoyt.database.config.reader.DatabaseConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

public class SqlMetaDataReader
{

    /**
     * Used to read in the config for a sql type query.
     * @param dbGen The generator configuration.
     * @param configs The configs.
     * @throws SQLException
     */
    public void read(DbGen dbGen, Map<String, DatabaseConfig> configs) throws SQLException
    {
        if (configs.containsKey(dbGen.database))
        {
            DatabaseConfig config = configs.get(dbGen.database);
            if (dbGen.table != null)
            {
                dbGen.sqlQuery = "SELECT * FROM " + Helpers.concatCbased(dbGen.table);
            }
            try (Connection conn = ConnectionHelper.createConnection(config))
            {
                PreparedStatement statement = conn.prepareStatement(dbGen.sqlQuery);
                ResultSetMetaData metaData = statement.getMetaData();
                int offset = config.offset;
                Column[] columns = new Column[metaData.getColumnCount()];
                for (int i = 1 ; i <= metaData.getColumnCount() ; i++)
                {
                    Column column = new Column();
                    column.isAutoIncrement = metaData.isAutoIncrement(i);
                    column.isNullable = metaData.isNullable(i) != ResultSetMetaData.columnNoNulls;
                    column.isAutoIncrement = metaData.isAutoIncrement(i);
                    column.isReadOnly = metaData.isReadOnly(i);
                    column.isWriteAble = metaData.isWritable(i);
                    column.name = metaData.getColumnName(i);
                    column.type = metaData.getColumnType(i);
                    column.offset = offset++;
                    columns[i - 1] = column;
                }
                dbGen.columns = columns;
            }
        } else
        {
            System.out.print("Database " + dbGen.database + " not found.");
            throw new RuntimeException("Unable to find database connection");
        }
    }
}
