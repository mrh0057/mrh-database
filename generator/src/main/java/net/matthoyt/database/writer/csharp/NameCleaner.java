package net.matthoyt.database.writer.csharp;

public class NameCleaner
{
    public static String cleanName(String columnName)
    {
        String[] nameParts = columnName.split("\\s+|_");
        if (nameParts.length == 1)
        {
            if (columnName.length() > 1 && columnName.equals(columnName.toUpperCase()))
            {
                return Character.toUpperCase(columnName.charAt(0)) + columnName.substring(1).toLowerCase();
            }
        }
        StringBuilder buffer = new StringBuilder(columnName.length());
        for (String part : nameParts)
        {
            if (part.length() == 1)
            {
                buffer.append(part.toLowerCase());
            } else
            {
                buffer.append(Character.toUpperCase(part.charAt(0)));
                int lastUpper = 1;
                for (int i = 1; i < part.length(); i++)
                {
                    char val = part.charAt(i);
                    if (Character.isUpperCase(val))
                    {
                        if (lastUpper > 0)
                        {
                            buffer.append(Character.toLowerCase(val));
                        } else
                        {
                            buffer.append(val);
                        }
                        lastUpper++;
                    } else
                    {
                        if (lastUpper > 1)
                        {
                            int idx = buffer.length() - 1;
                            if (buffer.length() > 1 && Character.isLowerCase(buffer.charAt(idx - 1)))
                            {
                                buffer.setCharAt(
                                    idx,
                                    Character.toUpperCase(buffer.charAt(idx)));
                            }
                        }
                        lastUpper = 0;
                        buffer.append(val);
                    }
                }
            }
        }
        return buffer.toString();
    }
}
