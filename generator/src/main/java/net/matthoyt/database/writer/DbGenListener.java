package net.matthoyt.database.writer;

import net.matthoyt.database.generator.DbGenBaseListener;
import net.matthoyt.database.generator.DbGenParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class DbGenListener extends DbGenBaseListener
{
    private String[] _qualifiedName;

    public DbGen dbGen = new DbGen();

    @Override
    public void exitModule(@NotNull DbGenParser.ModuleContext ctx)
    {
        dbGen.module = _qualifiedName;
    }

    @Override
    public void exitTable(@NotNull DbGenParser.TableContext ctx)
    {
        dbGen.table = _qualifiedName;
    }

    @Override
    public void exitName(@NotNull DbGenParser.NameContext ctx)
    {
        dbGen.name = ctx.getToken(DbGenParser.Identifier, 0).getText();
    }

    @Override
    public void exitDatabase(@NotNull DbGenParser.DatabaseContext ctx)
    {
        dbGen.database = ctx.getToken(DbGenParser.Identifier, 0).getText();
    }

    @Override
    public void exitColumn(@NotNull DbGenParser.ColumnContext ctx)
    {
        String tableColumnName = ctx.getToken(DbGenParser.Identifier, 0).getText();
        String columnNewName = ctx.getToken(DbGenParser.Identifier, 1).getText();
        dbGen.columnRenames.put(tableColumnName, columnNewName);
    }

    @Override
    public void exitColumnEnum(@NotNull DbGenParser.ColumnEnumContext ctx)
    {

        String columnName = ctx.getToken(DbGenParser.Identifier, 0).getText();
        String[] enumPath = _qualifiedName;
        dbGen.enumModels.put(columnName, enumPath);
    }

    @Override
    public void enterQualifiedName(@NotNull DbGenParser.QualifiedNameContext ctx)
    {
        List<TerminalNode> identifier = ctx.Identifier();
        String[] name = new String[identifier.size()];
        for (int i = 0 ; i < identifier.size() ; i ++)
        {
            name[i] = identifier.get(i).getSymbol().getText();
        }
        _qualifiedName = name;
        super.enterQualifiedName(ctx);
    }

    @Override
    public void exitSqlBlock(@NotNull DbGenParser.SqlBlockContext ctx)
    {
        String text = ctx.getText();
        dbGen.sqlQuery = text.substring(3, text.length() - 3).trim();
    }

    @Override
    public void exitSkipColumn(@NotNull DbGenParser.SkipColumnContext ctx)
    {
        dbGen.ignoreColumns.add(ctx.getToken(DbGenParser.Identifier, 0).getText());
    }

    @Override
    public void exitPrimaryKey(@NotNull DbGenParser.PrimaryKeyContext ctx)
    {
        dbGen.primaryKeys.add(ctx.getToken(DbGenParser.Identifier, 0).getText());
    }
}
