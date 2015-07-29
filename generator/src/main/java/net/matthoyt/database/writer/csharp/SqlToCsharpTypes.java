package net.matthoyt.database.writer.csharp;

import net.matthoyt.database.writer.SqlTranslation;
import net.matthoyt.database.writer.SqlTranslationBuilder;

import java.sql.Types;
import java.util.Map;

public class SqlToCsharpTypes
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
        .add(Types.DATE, "ReadDateTime", "ReadDateTimeNullable")
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
        .add(Types.TIME, "ReadDateTime", "ReadDateTimeNullable")
        .add(Types.TIMESTAMP, "ReadDateTime", "ReadDateTimeNullable")
        .add(Types.TIME_WITH_TIMEZONE, "ReadDateTime", "ReadDateTimeNullable")
        .add(Types.TIMESTAMP_WITH_TIMEZONE, "ReadDateTime", "ReadDateTimeNullable")
        .add(Types.CLOB, "ReadString", "ReadString")
        .add(Types.NCLOB, "ReadString", "ReadString")
        .add(Types.TINYINT,
            "ReadShort",
            "ReadShortNullable")
        .add(Types.VARBINARY, "ReadBytes", "ReadBytesNullable")
        .add(Types.VARCHAR, "ReadString", "ReadString")
        .build();

    private static Map<Integer, SqlTranslation> _sqlTypeToCsharp = new SqlTranslationBuilder()
        .add(Types.BIGINT, "long", "long?")
        .add(Types.BINARY, "byte[]", "byte[]")
        .add(Types.BIT,
            "bool",
            "bool?")
        .add(Types.CHAR, "string", "string")
        .add(Types.BOOLEAN, "bool", "bool?")
        .add(Types.BLOB, "byte[]", "byte[]")
        .add(Types.DATE, "DateTime", "DateTime?")
        .add(Types.DECIMAL, "decimal", "decimal?")
        .add(Types.DOUBLE, "double", "double?")
        .add(Types.FLOAT, "float", "float?")
        .add(Types.LONGNVARCHAR, "string", "string")
        .add(Types.LONGVARBINARY, "byte[]", "byte[]")
        .add(Types.LONGVARCHAR, "string", "string")
        .add(Types.INTEGER, "int", "int?")
        .add(Types.NCHAR, "string", "string")
        .add(Types.NUMERIC, "decimal", "decimal?")
        .add(Types.NVARCHAR, "string", "string")
        .add(Types.REAL, "float", "float?")
        .add(Types.SMALLINT, "short", "short?")
        .add(Types.TIME, "DateTime", "DateTime")
        .add(Types.TIMESTAMP, "DateTime", "DateTime")
        .add(Types.TIME_WITH_TIMEZONE, "DateTime", "DateTime")
        .add(Types.TIMESTAMP_WITH_TIMEZONE, "DateTime", "DateTime")
        .add(Types.CLOB, "string", "string")
        .add(Types.NCLOB, "string", "string")
        .add(Types.TINYINT,
            "short",
            "short?")
        .add(Types.VARBINARY, "byte[]", "byte[]")
        .add(Types.VARCHAR, "string", "string")
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
