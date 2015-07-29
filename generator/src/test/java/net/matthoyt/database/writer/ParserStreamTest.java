package net.matthoyt.database.writer;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

public class ParserStreamTest
{

    public static class QueryTest
    {
        private static final String _queryTest = "testFiles/QueryTestFile.mrhdb";

        @Test
        public void parseTestQuery() throws Exception
        {
            try (InputStream stream = new FileInputStream(_queryTest))
            {
                ParseStream parse = new ParseStream();
                DbGen result = parse.parse(stream);
                assertNotNull(result);
                assertEquals("SELECT\r\n"
                    + "*\r\n"
                    + "FROM\r\n"
                    + "myDb", result.sqlQuery);
            }
        }
    }

    public static class MainConfigTests
    {
        private static final String _queryTest = "testFiles/QueryTestFile.mrhdb";

        @Test
        public void parseTestQuery() throws Exception
        {
            try (InputStream stream = new FileInputStream(_queryTest))
            {
                ParseStream parse = new ParseStream();
                DbGen result = parse.parse(stream);
                assertNotNull(result);
                assertArrayEquals(
                    new String[]{
                        "hello",
                        "world"
                    },
                    result.module);
                assertEquals(
                    "Something",
                    result.name);
                assertEquals("sitCrm",
                    result.database);
                assertTrue(result.enumModels.containsKey("MyColumn"));
                assertArrayEquals(
                    new String[]{
                        "my",
                        "something"
                    },
                    result.enumModels.get("MyColumn"));
                assertTrue(result.columnRenames.containsKey("DbColumn2"));
            }
        }
    }

    public static class TableTest
    {
        private static final String _tableTest = "testFiles/TableTestFile.mrhdb";

        @Test
        public void parseTestTable() throws Exception
        {
            try (InputStream stream = new FileInputStream(_tableTest))
            {
                ParseStream parse = new ParseStream();
                DbGen result = parse.parse(stream);
                assertNotNull(result);
                assertArrayEquals(new String[]{
                    "MyTable",
                    "Something"
                },
                    result.table);
            }
        }
    }
}
