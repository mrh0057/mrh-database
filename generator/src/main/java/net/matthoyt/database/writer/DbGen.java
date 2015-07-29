package net.matthoyt.database.writer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DbGen
{

    public DbGen()
    {
        columnRenames = new HashMap<>(10);
        enumModels = new HashMap<>(10);
        ignoreColumns = new HashSet<>();
        primaryKeys = new HashSet<>();
    }

    public String[] module;
    public String name;
    public String database;
    public String sqlQuery;
    public String[] table;
    public Map<String, String[]>  enumModels;
    public Map<String, String> columnRenames;
    public HashSet<String> ignoreColumns;
    public HashSet<String> primaryKeys;

    public Column[] columns;

}
