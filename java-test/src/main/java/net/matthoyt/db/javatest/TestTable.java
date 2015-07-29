package net.matthoyt.db.javatest;

import org.joda.time.DateTime;
import net.matthoyt.database.wrapper.ResultSetReader;
import net.matthoyt.database.wrapper.PrepareStatementHelper;

import java.math.BigDecimal;
import java.sql.*;

/////////////////////////////////////
// File is generated do not modify //
/////////////////////////////////////

public class TestTable
{
    private int id;
    private String name;
    private Short smallIntType;
    private BigDecimal decimalType;

    public int getId()
    {
        return id;
    }

    public void setId(int value)
    {
        id = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String value)
    {
        name = value;
    }

    public Short getSmallIntType()
    {
        return smallIntType;
    }

    public void setSmallIntType(Short value)
    {
        smallIntType = value;
    }

    public BigDecimal getDecimalType()
    {
        return decimalType;
    }

    public void setDecimalType(BigDecimal value)
    {
        decimalType = value;
    }

    public static TestTable create(ResultSet reader, TestTable model) throws SQLException
    {
        model.setId(ResultSetReader.ReadInt(reader, 1));
        model.setName(ResultSetReader.ReadString(reader, 2));
        model.setSmallIntType(ResultSetReader.ReadShortNullable(reader, 3));
        model.setDecimalType(ResultSetReader.ReadDecimal(reader, 4));

        return model;
    }

    public static PreparedStatement insertStatement(Connection conn, TestTable model) throws SQLException
    {
        PreparedStatement statement = conn.prepareStatement("INSERT INTO table1(id,name,small_int_type,decimal_type) VALUES (?,?,?,?)");
        PrepareStatementHelper.setObject(statement, 1, model.getId(), Types.INTEGER);
        PrepareStatementHelper.setObject(statement, 2, model.getName(), Types.VARCHAR);
        PrepareStatementHelper.setObject(statement, 3, model.getSmallIntType(), Types.SMALLINT);
        PrepareStatementHelper.setObject(statement, 4, model.getDecimalType(), Types.NUMERIC);
        return statement;
    }

    public static PreparedStatement updateStatement(Connection conn, TestTable model) throws SQLException
    {
        PreparedStatement statement = conn.prepareStatement("UPDATE table1 SET name = ?, small_int_type = ?, decimal_type = ? WHERE id = ?;");
        PrepareStatementHelper.setObject(statement, 1, model.getName(), Types.VARCHAR);
        PrepareStatementHelper.setObject(statement, 2, model.getSmallIntType(), Types.SMALLINT);
        PrepareStatementHelper.setObject(statement, 3, model.getDecimalType(), Types.NUMERIC);
        PrepareStatementHelper.setObject(statement, 4, model.getId(), Types.INTEGER);
        return statement;
    }
}