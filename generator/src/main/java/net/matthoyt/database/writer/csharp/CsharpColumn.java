package net.matthoyt.database.writer.csharp;

public class CsharpColumn
{
    public String dataType;
    public String rawDataType;
    public String readFunction;
    public String name;
    public String rawName;
    public int offset;
    public boolean ignoreInsertUpdate;
    public boolean castType;
    public boolean isReadOnly;
    public boolean isAutoIncrement;
    public boolean isPrimaryKey;
    public boolean isNullable;
}
