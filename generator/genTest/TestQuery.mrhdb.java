package hello.world

import org.joda.time.DateTime;
import net.matthoyt.database.wrapper.ResultSetReader;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/////////////////////////////////////
// File is generated do not modify //
/////////////////////////////////////

public class Something
{
    private int id;
    private String name;
    private hello.world.NewEnum smallIntType;
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

    public hello.world.NewEnum getSmallIntType()
    {
        return smallIntType;
    }

    public void setSmallIntType(hello.world.NewEnum value)
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

    public static Something create(ResultSet reader, Something model)
    {
        model.setId(reader.ReadInt(1));
        model.setName(reader.ReadString(2));
        model.setSmallIntType((hello.world.NewEnum) reader.ReadShortNullable(3));
        model.setDecimalType(reader.ReadDecimal(4));

        return model;
    }
}