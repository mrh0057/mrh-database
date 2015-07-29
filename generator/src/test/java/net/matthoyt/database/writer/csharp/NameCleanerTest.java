package net.matthoyt.database.writer.csharp;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameCleanerTest
{
    @Test
    public void cleanNameTest()
    {
        String name = "tHe_Cat wentUP_hill";
        assertEquals("TheCatWentUpHill",
            NameCleaner.cleanName(name));
        name = "TheCatWentUpHill";
        assertEquals("TheCatWentUpHill",
            NameCleaner.cleanName(name));
        name = "fc_SOMEProp";
        assertEquals("FcSomeProp",
            NameCleaner.cleanName(name));
        name = "CUSIP";
        assertEquals("Cusip",
            NameCleaner.cleanName(name));
    }
}
