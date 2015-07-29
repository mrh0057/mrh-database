package net.matthoyt.database.writer;

public class SqlTranslation
{

    public final String valueType;
    public final String nullableType;
    public final String javaSqlType;

    public SqlTranslation(String valueType, String nullableType)
    {
        this.valueType = valueType;
        this.nullableType = nullableType;
        this.javaSqlType = "";
    }

    public SqlTranslation(String valueType, String nullableType, String javaSqlType)
    {
        this.valueType = valueType;
        this.nullableType = nullableType;
        this.javaSqlType = javaSqlType;
    }
}
