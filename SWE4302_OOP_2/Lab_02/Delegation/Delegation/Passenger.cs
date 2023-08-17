using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegation
{
    public class Passenger {

        private int _id {get; set;}
        private string _name { get; set;}

        public Passenger(int id, string name)
        {
            this._id = id;
            this._name = name;
        }

        public int getId () { return _id; }
        public string getName () { return _name; }
    }
}
