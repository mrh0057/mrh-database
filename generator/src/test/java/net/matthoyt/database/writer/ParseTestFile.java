package net.matthoyt.database.writer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ParseTestFile
{

    private static final String _path = "testFiles/";

    public static DbGen parse(String fileName) throws IOException
    {
        try (InputStream stream = new FileInputStream(_path + fileName))
        {
            ParseStream parse = new ParseStream();
            return parse.parse(stream);
        }
    }

}
