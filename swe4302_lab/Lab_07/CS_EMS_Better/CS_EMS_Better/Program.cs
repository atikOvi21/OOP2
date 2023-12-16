namespace CS_EMS_Better
{
    internal class Program
    {
        static void Main(string[] args)
        {
            EmployeeController employeeController = new EmployeeController();
            EmployeeReportController reportController = new EmployeeReportController(employeeController);
            reportController.GenerateReport();

            Console.WriteLine("\n");

            string searchName = "John Doe";
            Employee foundEmployee = employeeController.SearchEmployee(searchName);

            if (foundEmployee != null)
            {
                Console.WriteLine($"Found employee: {foundEmployee._name}" + "\n" +
                    $"Salary: {foundEmployee.GetSalary()}");
            }
            else
            {
                Console.WriteLine($"Employee '{searchName}' not found.");
            }

            Console.WriteLine("\n");

            Employee updatedEmployee = new Employee("John Doe", 5500, "Senior Engineer", DateTime.Now, 1500);
            bool isUpdated = employeeController.UpdateEmployee(updatedEmployee, "New NAME");

            if (isUpdated)
            {
                Console.WriteLine("Employee updated successfully.");
            }
            else
            {
                Console.WriteLine($"Employee '{updatedEmployee._name}' not found for update.");
            }

            employeeController.GetAllEmployees().ForEach(e => Console.WriteLine(e._name));
            Console.WriteLine("\n");

            Employee toDeleteEmployee = new Employee("Jane Smith", 6000, "Manager", new DateTime(2021, 8, 22), 1200);
            bool isDeleted = employeeController.DeleteEmployee(toDeleteEmployee);

            if (isDeleted)
            {
                Console.WriteLine($"Employee '{toDeleteEmployee._name}' deleted successfully.");
            }
            else
            {
                Console.WriteLine($"Employee '{toDeleteEmployee._name}' not found for deletion.");
            }

            employeeController.GetAllEmployees().ForEach(e => Console.WriteLine(e._name));
            Console.WriteLine("\n");
        }
    }
}