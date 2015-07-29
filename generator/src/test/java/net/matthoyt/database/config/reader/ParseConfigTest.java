package net.matthoyt.database.config.reader;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

public class ParseConfigTest
{

    public static class ConfigTest
    {
        private static final String _file = "testFiles/DbConfig.mrhdb.config";

        @Test
        public void parseConfigTest() throws Exception
        {
            try (InputStream stream = new FileInputStream(_file))
            {
                ParseConfig parse = new ParseConfig();
                Map<String, DatabaseConfig> configs = parse.parse(stream);

                assertTrue(configs.containsKey("MyDatabase"));

                DatabaseConfig config = configs.get("MyDatabase");
                assertEquals("jdbc:something", config.connection);
                assertEquals(1234, config.offset);
                assertEquals(2, config.properties.size());
                assertEquals("username", config.properties.get(0).key);
                assertEquals("name", config.properties.get(0).value);
            }
        }
    }
}
