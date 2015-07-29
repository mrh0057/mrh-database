package net.matthoyt.database.writer;

import java.io.IOException;

public interface IProcessor
{
    void ProcessFile(String location, DbGen dbGen) throws IOException;
}
