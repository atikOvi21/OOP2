using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VehicleMS
{
    public class Vehicle
    {
        public string Name { get; set; }

        public Vehicle(string name)
        {
            Name = name;
        }

        public void Start()
        {
            Console.WriteLine(Name + " vehicle started");
        }

        public void Stop()
        {
            Console.WriteLine(Name + " vehicle stopped");
        }
    }
}
