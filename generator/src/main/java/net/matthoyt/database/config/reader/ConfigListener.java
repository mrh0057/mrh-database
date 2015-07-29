package net.matthoyt.database.config.reader;

import net.matthoyt.database.config.DbConfigBaseListener;
import net.matthoyt.database.config.DbConfigParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigListener extends DbConfigBaseListener
{

    public Map<String, DatabaseConfig> _configs = new HashMap<>(10);
    public DatabaseConfig _currentDatabase;

    @Override
    public void exitSectionStart(@NotNull DbConfigParser.SectionStartContext ctx)
    {
        String name = ctx.getToken(DbConfigParser.Identifier, 0).getText();

        if (_configs.containsKey(name))
        {
            System.out.print("Duplicate name: " + name);
        }
        _currentDatabase = new DatabaseConfig();
        _currentDatabase.name = name;
        _configs.put(name, _currentDatabase);
    }

    @Override
    public void exitConnection(@NotNull DbConfigParser.ConnectionContext ctx)
    {
        String connection = ctx.getToken(DbConfigParser.ESCAPE_BLOCK, 0).getText();
        _currentDatabase.connection = getEscapeBlockText(connection);
    }

    @Override
    public void exitOffset(@NotNull DbConfigParser.OffsetContext ctx)
    {
        String offset = ctx.getToken(DbConfigParser.Int, 0).getText();
        _currentDatabase.offset = Integer.parseInt(offset);
    }

    @Override
    public void exitProperty(@NotNull DbConfigParser.PropertyContext ctx)
    {
        Property property = new Property();
        property.key = ctx.getToken(DbConfigParser.Identifier, 0).getText();
        property.value = getEscapeBlockText(ctx.getToken(DbConfigParser.ESCAPE_BLOCK, 0).getText());
        _currentDatabase.properties.add(property);
    }

    private String getEscapeBlockText(String value)
    {
        return value.substring(2, value.length() - 2);
    }
}
