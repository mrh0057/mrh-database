package net.matthoyt.database.writer.java;

public class JavaModel
{
    public boolean table;

    public String tableName;

    public String packageName;

    public String name;

    public JavaColumn[] columns;
    public JavaColumn[] updateColumns;
    public JavaColumn[] insertColumns;
    public JavaColumn primaryKey;
}
