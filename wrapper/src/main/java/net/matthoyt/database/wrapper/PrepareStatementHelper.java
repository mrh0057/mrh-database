package net.matthoyt.database.wrapper;

import org.joda.time.DateTime;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class PrepareStatementHelper
{

    /**
     * Sql statement helper to handle the joda time conversions.
     * @param statement The prepared statement.
     * @param offset The parameter offset.
     * @param value The value of the parameter.
     * @param sqlType The sql type.
     * @throws SQLException
     */
    public static void setObject(PreparedStatement statement, int offset, Object value, int sqlType) throws SQLException
    {
        switch (sqlType)
        {
            case Types.DATE:
            case Types.TIME:
            case Types.TIMESTAMP:
            case Types.TIME_WITH_TIMEZONE:
            case Types.TIMESTAMP_WITH_TIMEZONE:
                if (value instanceof DateTime)
                {
                    statement.setObject(offset, ((DateTime) value).toDate(), sqlType);
                } else
                {
                    statement.setObject(offset, value, sqlType);
                }
                break;

            default:
                statement.setObject(offset, value, sqlType);
                break;
        }
    }
}
