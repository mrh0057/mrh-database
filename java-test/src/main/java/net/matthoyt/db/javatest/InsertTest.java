package net.matthoyt.db.javatest;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertTest
{

    public static void main(String[] args) throws Exception
    {
        Connection conn = null;
        Properties props = new Properties();
        props.put("user", "postgres");
        props.put("password", "Password1");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost/db-utils",
            props);

        TestTable table = new TestTable();
        table.setDecimalType(new BigDecimal(1010));
        table.setId(101);
        table.setName("Ma");
        table.setSmallIntType((short) 3);

        PreparedStatement statement = TestTable.updateStatement(conn, table);

        statement.execute();
    }
}
