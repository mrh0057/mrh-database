package net.matthoyt.database.writer;

import net.matthoyt.database.config.reader.DatabaseConfig;
import net.matthoyt.database.config.reader.ParseConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * Used to get database configurations.
 */
public class SetupTestConnection
{

    private static final String _connectionFile = "testFiles/realConnections.mrhdb.config";

    public static Map<String, DatabaseConfig> getConfigs() throws IOException
    {
        ParseConfig config = new ParseConfig();
        return config.parse(new FileInputStream(_connectionFile));
    }
}
