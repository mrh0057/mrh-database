package net.matthoyt.database.writer.csharp;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupDir;
import org.stringtemplate.v4.STGroupFile;

import java.io.InputStream;

public class Writer
{

    public static String write(CsharpModel model)
    {
        STGroupFile group = new STGroupFile("templates/csharp/main.stg");
        ST st = group.getInstanceOf("main");
        st.add("model", model);
        return st.render();
    }
}
