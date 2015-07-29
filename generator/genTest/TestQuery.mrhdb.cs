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
        public hello.world.NewEnum? SmallIntType { get; set; }
        public decimal DecimalType { get; set; }


        public static Something Create<T>(DbDataReader reader, T model) where T:Something
        {
            model.Id = reader.ReadInt(1);
            model.Name = reader.ReadString(2);
            model.SmallIntType = (hello.world.NewEnum?) reader.ReadShortNullable(3);
            model.DecimalType = reader.ReadDecimal(4);

            return model;
        }

    }
}