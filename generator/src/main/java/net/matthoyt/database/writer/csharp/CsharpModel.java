package net.matthoyt.database.writer.csharp;

public class CsharpModel
{
    public boolean table;
    public String tableName;
    public String namespace;
    public String name;
    public CsharpColumn[] columns;
    public CsharpColumn[] updateColumns;
    public CsharpColumn[] insertColumns;
    public CsharpColumn primaryKey;
}
