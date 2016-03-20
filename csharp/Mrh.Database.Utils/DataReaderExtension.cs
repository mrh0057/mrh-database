using System;
using System.Data.Common;

namespace Mrh.Database.Utils
{
    public static class DataReaderExtensions
    {

        public static long ReadLong(this DbDataReader reader, int offset)
        {
            return reader.GetInt64(offset);
        }

        public static long? ReadLongNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return ReadLong(reader, offset);
        }

        public static bool ReadBool(this DbDataReader reader, int offset)
        {
            return reader.GetBoolean(offset);
        }

        public static bool? ReadBoolNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadBool(offset);
        }

        public static string ReadString(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.GetString(offset);
        }

        public static DateTime ReadDateTime(this DbDataReader reader, int offset)
        {
            return reader.GetDateTime(offset);
        }

        public static DateTime? ReadDateTimeNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadDateTime(offset);
        }

        public static decimal ReadDecimal(this DbDataReader reader, int offset)
        {
            return reader.GetDecimal(offset);
        }

        public static decimal? ReadDecimalNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadDecimal(offset);
        }

        public static double ReadDouble(this DbDataReader reader, int offset)
        {
            return reader.GetDouble(offset);
        }

        public static double? ReadDoubleNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadDouble(offset);
        }

        public static float ReadFloat(this DbDataReader reader, int offset)
        {
            return reader.GetFloat(offset);
        }

        public static float? ReadFloatNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadFloat(offset);
        }

        public static int ReadInt(this DbDataReader reader, int offset)
        {
            return reader.GetInt32(offset);
        }

        public static int? ReadIntNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadInt(offset);
        }

        public static short ReadShort(this DbDataReader reader, int offset)
        {
            return reader.GetInt16(offset);
        }

        public static short? ReadShortNullable(this DbDataReader reader, int offset)
        {
            if (reader.IsDBNull(offset))
            {
                return null;
            }
            return reader.ReadShort(offset);
        }
    }
}
