using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_EMS
{
    public class EmployeeController
    {
        private List<Employee> employees = new List<Employee>();

        public EmployeeController()
        {
            HireEmployee("John Doe", 5000, 1000, "Engineer", new DateTime(2023, 9, 21));
            HireEmployee("Jane Smith", 6000, 1200, "Manager", new DateTime(2021, 8, 22));
            HireEmployee("Bob", 30000, "Worker");
        }

        public void HireEmployee(string name, double basicSalary, double bonus, string designation, DateTime dateOfJoining)
        {
            Employee employee = new Employee(name, basicSalary, bonus, designation, dateOfJoining);
            employees.Add(employee);
        }

        private void HireEmployee(string name, double basicSalary, string designation)
        {
            Employee employee = new Employee(name, basicSalary, designation);
            employees.Add(employee);
        }

        public void SearchEmployee(string name)
        {
            foreach (Employee employee in employees)
            {
                if (employee.Name == name)
                {
                    Console.WriteLine("Name: " + employee.Name + "\n" + "Basic Salary: " + employee.BasicSalary + "\n" + "Date of Join: " + employee.DateOfJoining);
                }
            }
        }

        public bool UpdateEmployee(Employee updatedEmployee, string name, double baseSalary)
        {
            Employee existingEmployee = employees.FirstOrDefault(e => e.Name == updatedEmployee.Name);

            if (existingEmployee != null)
            {
                existingEmployee.Name = name;
                existingEmployee.BasicSalary = baseSalary;

                return true;
            }

            return false;
        }

        public bool DeleteEmployee(Employee employeeToDelete)
        {
            Employee existingEmployee = employees.FirstOrDefault(e => e.Name == employeeToDelete.Name);

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

