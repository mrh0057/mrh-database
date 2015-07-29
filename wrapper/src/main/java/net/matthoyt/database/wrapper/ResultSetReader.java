package net.matthoyt.database.wrapper;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * Wrapper around result set to make it easier to write a code generator.
 */
public class ResultSetReader
{
    /**
     * Make sure you are using UTC dates.
     *
     * @param result The result to read in.
     * @param column The column index
     * @return The joda time object.
     * @throws SQLException
     */
    public static DateTime ReadDateTime(ResultSet result, int column) throws SQLException
    {
        Timestamp timestamp = result.getTimestamp(column);
        return timestamp != null ? new DateTime(timestamp) : null;
    }

    public static String ReadString(ResultSet result, int column) throws SQLException
    {
        return result.getString(column);
    }

    public static int ReadInt(ResultSet result, int column) throws SQLException
    {
        return result.getInt(column);
    }

    public static Integer ReadIntNullable(ResultSet result, int column) throws SQLException
    {
        int value = result.getInt(column);
        if (result.wasNull())
        {
            return null;
        }

        return value;
    }

    public static short ReadShort(ResultSet result, int column) throws SQLException
    {
        return result.getShort(column);
    }

    public static Short ReadShortNullable(ResultSet result, int column) throws SQLException
    {
        short value = result.getShort(column);
        if (result.wasNull())
        {
            return null;
        }
        return value;
    }

    public static long ReadLong(ResultSet result, int column) throws SQLException
    {
        return result.getLong(column);
    }

    public static Long ReadLongNullable(ResultSet result, int column) throws SQLException
    {
        long value = result.getLong(column);
        if (result.wasNull())
        {
            return null;
        }
        return value;
    }

    public static boolean ReadBool(ResultSet result, int column) throws SQLException
    {
        return result.getBoolean(column);
    }

    public static Boolean ReadBoolNullable(ResultSet result, int column) throws SQLException
    {
        boolean value = result.getBoolean(column);
        if (result.wasNull())
        {
            return null;
        }
        return value;
    }

    public static BigDecimal ReadDecimal(ResultSet result, int column) throws SQLException
    {
        return result.getBigDecimal(column);
    }

    public static double ReadDouble(ResultSet result, int column) throws SQLException
    {
        return result.getDouble(column);
    }

    public static Double ReadDoubleNullable(ResultSet result, int column) throws SQLException
    {
        double value = result.getDouble(column);
        if (result.wasNull())
        {
            return null;
        }
        return value;
    }

    public static float ReadFloat(ResultSet result, int column) throws SQLException
    {
        return result.getFloat(column);
    }

    public static Float ReadFloatNullable(ResultSet result, int column) throws SQLException
    {
        float value = result.getFloat(column);
        if (result.wasNull())
        {
            return null;
        }
        return value;
    }
}
