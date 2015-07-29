package net.matthoyt.database.writer;

import net.matthoyt.database.config.reader.DatabaseConfig;
import net.matthoyt.database.config.reader.Property;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHelper
{

    public static Connection createConnection(DatabaseConfig config) throws SQLException
    {
        Properties connectionProps = new Properties();
        for (Property property : config.properties)
        {
            connectionProps.put(property.key, property.value);
        }
        return DriverManager.getConnection(config.connection, connectionProps);
    }
}
