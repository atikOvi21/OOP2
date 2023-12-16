using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegation
{
    public class Plane : Ticket
    {
        public Plane(int flightNumber, int availableSeats)
        {
            this._flightNumber = flightNumber;
            this._availableSeats = availableSeats;
        }

        private int _flightNumber { get; set; }
        private int _availableSeats { get; set; }

        public bool bookTicket(Passenger passenger)
        {
            if (_availableSeats > 0)
            {
                _availableSeats--;
                Console.WriteLine(" Ticket booked for passenger " + passenger.getName() + " on train " + _flightNumber);
                return true;
            }
            else
            {
                Console.WriteLine("No available seats on train " + _flightNumber);
                return false;
            }
        }
    }
}
