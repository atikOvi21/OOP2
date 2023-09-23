using System.Xml.Linq;

namespace CS_EMS_Better
{
    public class EmployeeReportController
    {
        private EmployeeController _employeeController;

        public EmployeeReportController(EmployeeController employeeController)
        {
            this._employeeController = employeeController;
        }

        public void GenerateReport()
        {
            Console.WriteLine($"Employess Count: {_employeeController.GetAllEmployees().Count}");
            string outputPath = @"G:\WORK\Java\SWE4302_OOP_2\Lab_07\CS_EMS_Better\EmployeeReport.xml";

            Console.WriteLine($"Report Path: {outputPath}");
            GenerateEmployeeXMLReport(_employeeController.GetAllEmployees(), outputPath);
        }

        public void GenerateEmployeeXMLReport(List<Employee> employees, string outputPath)
        {
            try
            {
                var xmlDocument = new XDocument(
                    new XDeclaration("1.0", "utf-8", "yes"),
                    new XElement("EmployeeData",
                        employees.Select(employee => new XElement("Employee",
                            new XElement("Name", employee._name),
                            new XElement("BasicSalary", employee._basicSalary),
                            new XElement("Bonus", employee._bonus),
                            new XElement("Designation", employee._designation),
                            new XElement("DateOfJoining", employee._dateOfJoining),
                            new XElement("TotalSalary", employee.GetSalary())
                        ))
                    )
                );

                xmlDocument.Save(outputPath);

                Console.WriteLine("Employee XML report generated successfully.");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error generating the employee XML report: {ex.Message}");
            }
        }
    }
}
