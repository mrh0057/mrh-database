package net.matthoyt.database.config.reader;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConfig
{

    public DatabaseConfig()
    {
        properties = new ArrayList<>(10);
    }

    public String name;
    public String connection;
    public int offset;
    public List<Property> properties;

}
