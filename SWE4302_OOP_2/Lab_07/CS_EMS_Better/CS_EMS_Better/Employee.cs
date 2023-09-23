namespace CS_EMS_Better
{
    public class Employee
    {
        public string _name { get; set; }
        public double _salary { get; set; }
        public double _basicSalary { get; set; }
        public double _bonus { get; set; }
        public string _designation { get; set; }
        public DateTime _dateOfJoining { get; set; }
        public double _houseAllowance { get; set; }
        public double _transportAllowance { get; private set; }
        public double _costOfLiving { get; private set; }

        public Employee()
        {
        }

        public Employee(string name, double salary) : this()
        {
            this._name = name;
            this._salary = salary;
        }

        public Employee(string name, double basicSalary, string designation) : this(name, basicSalary)
        {
            this._designation = designation;
            this._houseAllowance = basicSalary * 0.4;
            this._transportAllowance = 5000;
            this._costOfLiving = 1000;
            this._dateOfJoining = DateTime.Now;
        }

        public Employee(string name, double basicSalary, string designation, DateTime dateOfJoining, double bonus)
            : this(name, basicSalary, designation)
        {
            this._dateOfJoining = dateOfJoining;
            this._bonus = bonus;
        }

        public double GetSalary()
        {
            return _basicSalary + _houseAllowance + _transportAllowance + _costOfLiving + _bonus;
        }

        public double CalculateSalary()
        {
            double basicSalary = _basicSalary;
            double houseAllowance = CalculateHouseAllowance(basicSalary);
            double transportAllowance = 5000;
            double costOfLiving = 800;
            double bonus = _bonus;

            double totalSalary = basicSalary + houseAllowance + transportAllowance + costOfLiving + bonus;

            return totalSalary;
        }

        private double CalculateHouseAllowance(double basicSalary)
        {
            return 0.4 * basicSalary;
        }

    }
}
