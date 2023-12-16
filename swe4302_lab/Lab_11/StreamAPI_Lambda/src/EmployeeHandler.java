import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHandler {
    public void filterByAge(List<Employee> employees) {
        employees.stream().filter(e -> e.getAge() > 30).forEach(e -> System.out.println(e.getFirstName()));
    }

    public void groupByPostalCode(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(e -> e.getPostalCode())).forEach((postalCode, employeeList) -> {
            System.out.println(postalCode + " -> " + "Employees: " + employeeList.size());
            employeeList.forEach(e -> System.out.println(e.getFirstName()));
        });
    }

    public void averageRemuneration(List<Employee> employees) {
        System.out.println(employees.stream().mapToDouble(e -> e.getRemuneration()).average().getAsDouble());
    }

    public void findHighestRemuneration(List<Employee> employees) {
        System.out.println(employees.stream().max(Comparator.comparingDouble(e -> e.getRemuneration())).get().getFirstName());
    }

    public void checkForManager(List<Employee> employees) {
        System.out.println(employees.stream().anyMatch(e -> e.getDesignation().equals("Manager")));
    }

    public void sortByAge(List<Employee> employees) {
        System.out.println("Ascending order -> ");
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(e -> System.out.println(e.getFirstName()));
        System.out.println("-------------------------");
        System.out.println("Descending order ->");
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(e -> System.out.println(e.getFirstName()));
    }

    public void findYoungestEmployee(List<Employee> employees) {
        System.out.println(employees.stream().min(Comparator.comparingInt(e -> e.getAge())).get().getFirstName());
    }

    public void countByDistrict(List<Employee> employees) {
        System.out.println(employees.stream().filter(e -> e.getDistrict().equals("Uptown")).count());
    }

    public void distinctPostalCode(List<Employee> employees) {
        employees.stream().mapToInt(e -> e.getPostalCode()).distinct().forEach(e -> System.out.println(e));
    }

    public void totalRemuneration(List<Employee> employees) {
        System.out.println(employees.stream().reduce(0.0, (subtotal, employee) -> subtotal + employee.getRemuneration(), Double::sum));
    }

    public void areAdults(List<Employee> employees) {
        System.out.println(employees.stream().allMatch(e -> e.getAge() > 18));
    }

    public void skipEmployees(List<Employee> employees) {
        employees.stream().skip(3).forEach(e -> System.out.println(e.getFirstName()));
    }

    public void averageAgeInDistrict(List<Employee> employees) {
        System.out.println(employees.stream().filter(e -> e.getDistrict().equals("Downtown")).mapToInt(e -> e.getAge()).average().getAsDouble());
    }

    public void displayTop3Remunerations(List<Employee> employees) {
        employees.stream().sorted(Comparator.comparingDouble(Employee::getRemuneration).reversed()).limit(3).forEach(e -> System.out.println(e.getFirstName() + " " + e.getRemuneration()));
    }
}
