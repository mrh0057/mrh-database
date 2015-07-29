package net.matthoyt.database.writer.csharp;

import net.matthoyt.database.config.reader.DatabaseConfig;
import net.matthoyt.database.config.reader.ParseConfig;
import net.matthoyt.database.writer.ProcessFiles;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

public class CsharpFullTest
{

    private static final String directory = "genTest";
    private static final String config = "testFiles/realConnections.mrhdb.config";

    @Test
    public void fullRunTest() throws Exception
    {
        try (InputStream stream = new FileInputStream(config))
        {
            ParseConfig parseConfig = new ParseConfig();
            Map<String, DatabaseConfig> configs = parseConfig.parse(stream);
            ProcessFiles.processDirectory(directory,
                configs,
                new CsharpProcessor());
        }
    }
}
