namespace CS_EMS
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee employee = new Employee();
            employee.GenerateReport();

            Console.WriteLine("\n");

            EmployeeController employeeController = new EmployeeController();
            employeeController.SearchEmployee("John Doe");
            Console.WriteLine("\n");

            Employee jEmployee = new Employee("John Doe", 5000, 1000, "Engineer", new DateTime(2023, 9, 21));
            Employee sEmployee = new Employee("Jane Smith", 6000, 1200, "Manager", new DateTime(2021, 8, 22));

            employeeController.DeleteEmployee(jEmployee);
            employeeController.GetAllEmployees().ForEach(e => Console.WriteLine(e.Name));

            Console.WriteLine("\n");

            employeeController.UpdateEmployee(sEmployee, "New Name", 2300.00);
            employeeController.GetAllEmployees().ForEach(e => Console.WriteLine(e.Name));

        }
    }
}