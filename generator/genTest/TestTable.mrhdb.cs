using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Data;
using Mrh.Database.Utils;

namespace hello.world
{

    //////////////////////////////////////
    // File is generated do not modify  //
    //////////////////////////////////////
    public class Something
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public short? SmallIntType { get; set; }
        public decimal DecimalType { get; set; }


        public static Something Create<T>(DbDataReader reader, T model) where T:Something
        {
            model.Id = reader.ReadInt(1);
            model.Name = reader.ReadString(2);
            model.SmallIntType = reader.ReadShortNullable(3);
            model.DecimalType = reader.ReadDecimal(4);

            return model;
        }

        /// <summary>
        ///     Creates a DataTable representing the model.  Useful for doing bulk inserts into SQL Server.
        /// </summary>
        /// <returns>The defined data table.</returns>
        public static DataTable CreateDataTable() {
            DataTable table = new DataTable("table1");
            List<DataColumn> primaryKeys = new List<DataColumn>(1);
            DataColumn column;

            column = new DataColumn {
                DataType = typeof(int),
                ColumnName = "id",
                ReadOnly = false,
                AutoIncrement = false,
            };
            table.Columns.Add(column);
            primaryKeys.Add(column);
            column = new DataColumn {
                DataType = typeof(string),
                ColumnName = "name",
                ReadOnly = false,
                AutoIncrement = false,
            };
            table.Columns.Add(column);
            column = new DataColumn {
                DataType = typeof(short),
                ColumnName = "small_int_type",
                ReadOnly = false,
                AutoIncrement = false,
            };
            table.Columns.Add(column);
            column = new DataColumn {
                DataType = typeof(decimal),
                ColumnName = "decimal_type",
                ReadOnly = false,
                AutoIncrement = false,
            };
            table.Columns.Add(column);

            table.PrimaryKey = primaryKeys.ToArray();
            return table;
        }

        public static void Insert(DataTable table, Something model)
        {
            var row = table.NewRow();
            table.Rows.Add(row);
            row["id"] = model.Id;


            if (model.Name == null)
            {
                row["name"] = DBNull.Value;
            } else
            {
                row["name"] = model.Name;

            }

            if (model.SmallIntType == null)
            {
                row["small_int_type"] = DBNull.Value;
            } else
            {
                row["small_int_type"] = model.SmallIntType;

            }

            row["decimal_type"] = model.DecimalType;



        }

        public static void Update(DataTable table, Something model)
        {
            var row = table.NewRow();
            table.Rows.Add(row);
            row["id"] = model.Id;


            if (model.Name == null)
            {
                row["name"] = DBNull.Value;
            } else
            {
                row["name"] = model.Name;

            }

            if (model.SmallIntType == null)
            {
                row["small_int_type"] = DBNull.Value;
            } else
            {
                row["small_int_type"] = model.SmallIntType;

            }

            row["decimal_type"] = model.DecimalType;



        }

        public static DbCommand InsertCommand(DbCommand command, Something model)
        {
            command.CommandType = CommandType.Text;
            command.CommandText = @"
                INSERT INTO table1
                (
                id,
                name,
                small_int_type,
                decimal_type
                )
                VALUES
                (
                @Id,
                @Name,
                @SmallIntType,
                @DecimalType
                )
            ";
            command.AddParameterWithNullable("@Id", model.Id);
            command.AddParameterWithNullable("@Name", model.Name);
            command.AddParameterWithNullable("@SmallIntType", model.SmallIntType);
            command.AddParameterWithNullable("@DecimalType", model.DecimalType);
            return command;
        }

        public static DbCommand UpdateCommand(DbCommand command, Something model)
        {
            command.CommandType = CommandType.Text;
            command.CommandText = @"
                UPDATE
                    table1
                SET
                    name = @Name,
                    small_int_type = @SmallIntType,
                    decimal_type = @DecimalType
                WHERE
                    id = @Id;
            ";
            command.AddParameterWithNullable("@Id", model.Id);
            command.AddParameterWithNullable("@Name", model.Name);
            command.AddParameterWithNullable("@SmallIntType", model.SmallIntType);
            command.AddParameterWithNullable("@DecimalType", model.DecimalType);
            return command;
        }
    }
}