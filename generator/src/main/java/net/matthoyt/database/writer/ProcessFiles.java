package net.matthoyt.database.writer;

import net.matthoyt.database.config.reader.DatabaseConfig;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

public class ProcessFiles
{

    private final static String[] extensions = new String[] {"mrhdb"};
    private final static ParseStream parser = new ParseStream();

    /**
     * Finds the files that should be have code generated from.
     * @param directory The directory to search for files.
     * @return A collection of files to process.
     */
    public static void processDirectory(
        String directory,
        Map<String, DatabaseConfig> configs,
        IProcessor processor) throws IOException, SQLException
    {
        File dir = new File(directory);
        Collection<File> files = FileUtils.listFiles(dir, extensions, true);
        for (File file : files)
        {
            try (InputStream stream = new FileInputStream(file))
            {
                System.out.println("Processing file: " + file.getAbsolutePath());
                SqlMetaDataReader metaDataReader = new SqlMetaDataReader();
                DbGen dbGen = parser.parse(stream);
                metaDataReader.read(dbGen, configs);
                processor.ProcessFile(file.getAbsolutePath(), dbGen);
            }
        }
    }
}
