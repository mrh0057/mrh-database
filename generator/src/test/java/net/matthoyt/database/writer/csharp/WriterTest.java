package net.matthoyt.database.writer.csharp;

import org.junit.Assert;
import org.junit.Test;

public class WriterTest
{

    public static class SimpleTest
    {
        private String result = "testFile.mrhdb.cs";

        @Test
        public void writeOutTest()
        {
            CsharpModel model = new CsharpModel();
            model.namespace = "Mrh.Database.Test";
            model.name = "MyClass";
            model.columns = new CsharpColumn[2];
            model.columns[0] = new CsharpColumn();
            model.columns[0].dataType = "int";
            model.columns[0].name = "Name1";
            model.columns[0].readFunction = "ReadInt";
            model.columns[0].offset = 1;
            model.columns[1] = new CsharpColumn();
            model.columns[1].dataType = "string";
            model.columns[1].name = "Name2";
            model.columns[1].readFunction = "ReadString";
            model.columns[1].offset = 2;

            String result = Writer.write(model);
            Assert.assertEquals("",
                result);
        }
    }
}
