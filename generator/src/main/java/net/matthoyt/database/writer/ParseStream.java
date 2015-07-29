package net.matthoyt.database.writer;

import net.matthoyt.database.generator.DbGenLexer;
import net.matthoyt.database.generator.DbGenParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Matt Hoyt on 5/7/2015.
 */
public class ParseStream
{

    /**
     * Returns the module necessary for the code generator.
     * @param inputStream
     * @return
     * @throws IOException
     */
    public DbGen parse(InputStream inputStream) throws IOException
    {
        CharStream charStream = new ANTLRInputStream(inputStream);
        DbGenLexer lexer = new DbGenLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DbGenParser parser = new DbGenParser(tokens);
        ParseTree parseTree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        DbGenListener extractor = new DbGenListener();
        walker.walk(extractor, parseTree);
        return extractor.dbGen;
    }
}
