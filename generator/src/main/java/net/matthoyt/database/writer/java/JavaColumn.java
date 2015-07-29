package net.matthoyt.database.writer.java;

public class JavaColumn
{
    public String dataType;
    public String rawDataType;
    public String readFunction;
    public String name;
    public String fieldName;
    public String rawName;
    public int offset;
    public boolean ignoreInsertUpdate;
    public boolean castType;
    public boolean isReadOnly;
    public boolean isAutoIncrement;
    public boolean isPrimaryKey;
    public boolean isNullable;
    public String sqlType;
    public int updateOffset;
    public int insertOffset;
}
