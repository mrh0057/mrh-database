package net.matthoyt.database.writer.csharp;

import net.matthoyt.database.writer.DbGen;
import net.matthoyt.database.writer.Helpers;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CsharpProcessor implements net.matthoyt.database.writer.IProcessor
{

    /**
     * Used to process an incoming file.
     * @param location The location to save the file to.
     * @param dbGen The db gen for the file.
     */
    @Override
    public void ProcessFile(String location, DbGen dbGen) throws IOException
    {
        CsharpModel model = new CsharpModel();
        model.name = dbGen.name;
        model.namespace = Helpers.concatCbased(dbGen.module);
        ColumnProcessor.processColumns(model, dbGen);
        model.table = dbGen.table != null;
        if (dbGen.table != null)
        {
            model.tableName = Helpers.concatCbased(dbGen.table);
        }
        String result = Writer.write(model);
        FileUtils.writeStringToFile(new File(location + ".cs"),
            result,
            false);
    }
}
