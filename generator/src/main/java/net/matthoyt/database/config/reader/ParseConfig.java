package net.matthoyt.database.config.reader;

import net.matthoyt.database.config.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class ParseConfig
{

    public Map<String, DatabaseConfig> parse(InputStream stream) throws IOException
    {
        CharStream charStream = new ANTLRInputStream(stream);
        DbConfigLexer lexer = new DbConfigLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DbConfigParser parser = new DbConfigParser(tokens);
        ParseTree parseTree = parser.config();

        ParseTreeWalker walker = new ParseTreeWalker();
        ConfigListener extractor = new ConfigListener();
        walker.walk(extractor, parseTree);
        return extractor._configs;
    }
}
