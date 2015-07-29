package net.matthoyt.database.writer;

public class Helpers
{
    public static String concatCbased(String[] format)
    {
        StringBuilder builder = new StringBuilder(500);
        for (int i = 0 ; i < format.length ; i++)
        {
            builder.append(format[i]);
            builder.append(".");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
