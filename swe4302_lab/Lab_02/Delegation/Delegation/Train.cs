using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegation
{
    public class Train : Ticket {

        public Train(int trainNumber, int availableSeats)
        {
            this._trainNumber = trainNumber;
            this._availableSeats = availableSeats;
        }

        private int _trainNumber { get; set; }
        private int _availableSeats { get; set; }

        public bool bookTicket(Passenger passenger)
        {
            if( _availableSeats > 0 )
            {
                _availableSeats--;
                Console.WriteLine(" Ticket booked for passenger " + passenger.getName() + " on train " + _trainNumber);
                return true;
            } else
            {
                Console.WriteLine("No available seats on train " + _trainNumber);
                return false;
            }
        }
    }
}
