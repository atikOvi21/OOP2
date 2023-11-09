import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        CSVHandler csvHandler = new CSVHandler("employee_data.csv");
        csvHandler.readFromCSV(employees);
        System.out.println("Employees from CSV -> ");
        csvHandler.printEmployees(employees);

        EmployeeHandler employeeHandler = new EmployeeHandler();
        System.out.println("-------------------------");
        System.out.println("Employees above 30 years");
        employeeHandler.filterByAge(employees);
        System.out.println("-------------------------");
        System.out.println("Employees grouped by postal code");
        employeeHandler.groupByPostalCode(employees);
        System.out.println("-------------------------");
        System.out.println("Average remuneration");
        employeeHandler.averageRemuneration(employees);
        System.out.println("-------------------------");
        System.out.println("Highest remuneration");
        employeeHandler.findHighestRemuneration(employees);
        System.out.println("-------------------------");
        System.out.println("Is there any manager?");
        employeeHandler.checkForManager(employees);
        System.out.println("-------------------------");
        System.out.println("Sorted by age");
        employeeHandler.sortByAge(employees);
        System.out.println("-------------------------");
        System.out.println("Youngest employee");
        employeeHandler.findYoungestEmployee(employees);
        System.out.println("-------------------------");
        System.out.println("Employees in Uptown");
        employeeHandler.countByDistrict(employees);
        System.out.println("-------------------------");
        System.out.println("Distinct postal codes");
        employeeHandler.distinctPostalCode(employees);
        System.out.println("-------------------------");
        System.out.println("Total remuneration");
        employeeHandler.totalRemuneration(employees);
        System.out.println("-------------------------");
        System.out.println("Are all employees adults?");
        employeeHandler.areAdults(employees);
        System.out.println("-------------------------");
        System.out.println("Skip first 3 employees");
        employeeHandler.skipEmployees(employees);
        System.out.println("-------------------------");
        System.out.println("Average age in Downtown");
        employeeHandler.averageAgeInDistrict(employees);
        System.out.println("-------------------------");
        System.out.println("Top 3 remunerations");
        employeeHandler.displayTop3Remunerations(employees);
    }
}