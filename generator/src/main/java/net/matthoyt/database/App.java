package net.matthoyt.database;

import net.matthoyt.database.config.reader.DatabaseConfig;
import net.matthoyt.database.config.reader.ParseConfig;
import net.matthoyt.database.writer.IProcessor;
import net.matthoyt.database.writer.ProcessFiles;
import net.matthoyt.database.writer.csharp.CsharpProcessor;
import net.matthoyt.database.writer.java.JavaProcessor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

public class App
{
    public static void main(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println("1) Config file location.");
            System.out.println("2) Directory to process.");
            System.out.println("3) Language csharp or java");
            return;
        }
        try
        {
            String configFile = args[0];
            ParseConfig config = new ParseConfig();
            try (InputStream stream = new FileInputStream(configFile))
            {
                Map<String, DatabaseConfig> configs = config.parse(stream);
                String language = args[2];
                if ("csharp".equals(language))
                {
                    ProcessFiles.processDirectory(args[1],
                        configs,
                        new CsharpProcessor());
                }
                else if ("java".equals(language))
                {
                    ProcessFiles.processDirectory(args[1], configs, new JavaProcessor());
                }
                else
                {
                    System.out.print("Unknown language: " + language);
                }
            }
        } catch (Exception ex)
        {
            System.out.print(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
