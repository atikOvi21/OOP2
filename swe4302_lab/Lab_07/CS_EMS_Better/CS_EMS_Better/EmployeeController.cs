namespace CS_EMS_Better
{
    public class EmployeeController
    {
        private List<Employee> employees = new List<Employee>();

        public EmployeeController()
        {
            HireEmployee("John Doe", 5000, "Engineer", new DateTime(2023, 9, 21), 1000);
            HireEmployee("Jane Smith", 6000, "Manager", new DateTime(2021, 8, 22), 1200);
            HireEmployee("Bob", 30000, "Worker");
        }

        public void HireEmployee(string name, double basicSalary, string designation, DateTime? dateOfJoining = null, double bonus = 0)
        {
            Employee employee = new Employee(name, basicSalary, designation, dateOfJoining ?? DateTime.Now, bonus);
            employees.Add(employee);
        }

        public Employee SearchEmployee(string name)
        {
            foreach (Employee employee in employees)
            {
                if (employee._name.Equals(name, StringComparison.OrdinalIgnoreCase))
                {
                    return employee;
                }
            }

            return null;
        }


        public bool UpdateEmployee(Employee updatedEmployee, string name)
        {
            Employee existingEmployee = SearchEmployee(updatedEmployee._name);

            if (existingEmployee != null)
            {
                existingEmployee._name = name;
                return true;
            }

            return false;
        }

        public bool DeleteEmployee(Employee employeeToDelete)
        {
            Employee existingEmployee = SearchEmployee(employeeToDelete._name);

            if (existingEmployee != null)
            {
                employees.Remove(existingEmployee);
                return true;
            }

            return false;
        }

        public List<Employee> GetAllEmployees()
        {
            return employees;
        }
    }
}
