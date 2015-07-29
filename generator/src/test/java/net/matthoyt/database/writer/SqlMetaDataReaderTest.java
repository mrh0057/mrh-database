package net.matthoyt.database.writer;

import net.matthoyt.database.config.reader.DatabaseConfig;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Map;

public class SqlMetaDataReaderTest
{

    private static final String testFile = "SqlRealTest.mrhdb";
    private static final SqlMetaDataReader reader = new SqlMetaDataReader();

    @Test
    public void SqlMetaDataReaderTest() throws Exception
    {
        Map<String, DatabaseConfig> configs = SetupTestConnection.getConfigs();
        DbGen dbGen = ParseTestFile.parse(testFile);
        reader.read(dbGen,
            configs);

        assertEquals(4,
            dbGen.columns.length);
        assertEquals("id",
            dbGen.columns[0].name);
    }

}
