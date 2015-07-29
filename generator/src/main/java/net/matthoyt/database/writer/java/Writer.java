package net.matthoyt.database.writer.java;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

public class Writer
{
    public static String write(JavaModel model)
    {
        STGroupFile group = new STGroupFile("templates/java/main.stg");
        ST st = group.getInstanceOf("main");
        st.add("model", model);
        return st.render();
    }
}
