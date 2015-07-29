package net.matthoyt.database.writer;

import java.util.HashMap;
import java.util.Map;

public class SqlTranslationBuilder
{

    private Map<Integer, SqlTranslation> _translations;

    public SqlTranslationBuilder()
    {
        _translations = new HashMap<>();
    }

    public SqlTranslationBuilder add(int javaType, String valueType, String nullableType)
    {
        _translations.put(javaType, new SqlTranslation(valueType, nullableType));
        return this;
    }
    public SqlTranslationBuilder add(int javaType, String valueType, String nullableType, String javaSqlType)
    {
        _translations.put(javaType, new SqlTranslation(valueType, nullableType, javaSqlType));
        return this;
    }

    public Map<Integer, SqlTranslation> build()
    {
        return _translations;
    }
}
