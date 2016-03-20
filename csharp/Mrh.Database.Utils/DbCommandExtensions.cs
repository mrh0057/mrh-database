using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mrh.Database.Utils
{
    public static class DbCommandExtensions
    {

        public static DbCommand AddParameterWithNullable(this DbCommand command, string name, object value)
        {
            var parameter = command.CreateParameter();
            parameter.ParameterName = name;
            if (value == null)
            {
                parameter.Value = DBNull.Value;
            }
            else
            {
                parameter.Value = value;
            }
            command.Parameters.Add(parameter);
            return command;
        }
    }
}
