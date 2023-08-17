﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegation
{
    public class BookingManagement {

        public static void bookTicket (Ticket ticket, Passenger passenger)
        {
            ticket.bookTicket(passenger);
        }
    }
}
