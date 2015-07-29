package net.matthoyt.database.writer.java;

import net.matthoyt.database.writer.SqlTranslation;
import net.matthoyt.database.writer.SqlTranslationBuilder;

import java.sql.Types;
import java.util.Map;

public class SqlToJavaTypes
{
    private static Map<Integer, SqlTranslation> _sqlTypeToCsharpReadFunctions = new SqlTranslationBuilder()
        .add(Types.BIGINT, "ReadLong", "ReadLongNullable")
        .add(Types.BINARY,
            "ReadBytes",
            "ReadBytes")
        .add(Types.BIT, "ReadBool", "ReadBoolNullable")
        .add(Types.CHAR, "ReadString", "ReadString")
        .add(Types.BOOLEAN, "ReadBool", "ReadBoolNullable")
        .add(Types.BLOB, "ReadBytes", "ReadBytesNullable")
        .add(Types.DATE, "ReadDateTime", "ReadDateTime")
        .add(Types.DECIMAL, "ReadDecimal", "ReadDecimalNullable")
        .add(Types.DOUBLE, "ReadDouble", "ReadDoubleNullable")
        .add(Types.FLOAT, "ReadFloat", "ReadFloatNullable")
        .add(Types.LONGNVARCHAR, "ReadString", "ReadString")
        .add(Types.LONGVARBINARY, "ReadBytes", "ReadBytesNullable")
        .add(Types.LONGVARCHAR, "ReadString", "ReadString")
        .add(Types.INTEGER, "ReadInt", "ReadIntNullable")
        .add(Types.NCHAR, "ReadString", "ReadString")
        .add(Types.NUMERIC, "ReadDecimal", "ReadDecimalNullable")
        .add(Types.NVARCHAR, "ReadString", "ReadString")
        .add(Types.REAL, "ReadFloat", "ReadFloatNullable")
        .add(Types.SMALLINT, "ReadShort", "ReadShortNullable")
        .add(Types.TIME, "ReadDateTime", "ReadDateTime")
        .add(Types.TIMESTAMP, "ReadDateTime", "ReadDateTime")
        .add(Types.TIME_WITH_TIMEZONE, "ReadDateTime", "ReadDateTime")
        .add(Types.TIMESTAMP_WITH_TIMEZONE, "ReadDateTime", "ReadDateTime")
        .add(Types.CLOB, "ReadString", "ReadString")
        .add(Types.NCLOB, "ReadString", "ReadString")
        .add(Types.TINYINT,
            "ReadShort",
            "ReadShortNullable")
        .add(Types.VARBINARY, "ReadBytes", "ReadBytesNullable")
        .add(Types.VARCHAR, "ReadString", "ReadString")
        .build();

    private static Map<Integer, SqlTranslation> _sqlTypeToCsharp = new SqlTranslationBuilder()
        .add(Types.BIGINT, "long", "Long", "Types.BIGINT")
        .add(Types.BINARY, "byte[]", "byte[]", "Types.BINARY")
        .add(Types.BIT,
            "boolean",
            "Boolean", "Types.BIT")
        .add(Types.CHAR,
            "String",
            "String",
            "Types.CHAR")
        .add(Types.CHAR, "boolean", "Boolean", "Types.CHAR")
        .add(Types.BLOB, "byte[]", "byte[]", "Types.BLOB")
        .add(Types.DATE, "DateTime", "DateTime", "Types.DATE")
        .add(Types.DECIMAL, "BigDecimal", "BigDecimal", "Types.DECIMAL")
        .add(Types.DOUBLE, "double", "Double?", "Types.DOUBLE")
        .add(Types.FLOAT, "float", "Float", "Types.FLOAT")
        .add(Types.LONGNVARCHAR, "String", "String", "Types.LONGNVARCHAR")
        .add(Types.LONGVARBINARY, "byte[]", "byte[]", "Types.LONGVARBINARY")
        .add(Types.LONGVARCHAR, "String", "String", "Types.LONGVARCHAR")
        .add(Types.INTEGER, "int", "Integer", "Types.INTEGER")
        .add(Types.NCHAR, "String", "String", "Types.NCHAR")
        .add(Types.NUMERIC, "BigDecimal", "BigDecimal", "Types.NUMERIC")
        .add(Types.NVARCHAR, "String", "String", "Types.NVARCHAR")
        .add(Types.REAL, "float", "Float", "Types.REAL")
        .add(Types.SMALLINT, "short", "Short", "Types.SMALLINT")
        .add(Types.TIME, "DateTime", "DateTime", "Types.TIME")
        .add(Types.TIMESTAMP, "DateTime", "DateTime", "Types.TIMESTAMP")
        .add(Types.TIME_WITH_TIMEZONE, "DateTime", "DateTime", "Types.TIME_WITH_TIMEZONE")
        .add(Types.TIMESTAMP_WITH_TIMEZONE, "DateTime", "DateTime", "Types.TIMESTAMP_WITH_TIMEZONE")
        .add(Types.CLOB, "String", "String", "Types.CLOB")
        .add(Types.NCLOB, "String", "String", "Types.NCLOB")
        .add(Types.TINYINT,
            "short",
            "Short", "Types.TINYINT")
        .add(Types.VARBINARY, "byte[]", "byte[]", "Types.VARBINARY")
        .add(Types.VARCHAR, "String", "String", "Types.VARCHAR")
        .build();

    public static SqlTranslation SqlTypeToDatType(int sqlType)
    {
        return _sqlTypeToCsharp.get(sqlType);
    }

    public static SqlTranslation SqlTypeToRead(int sqlType)
    {
        return _sqlTypeToCsharpReadFunctions.get(sqlType);
    }
}
