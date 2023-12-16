import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private final String filePath;

    public CSVHandler(String filePath) {
        this.filePath = filePath;
    }

    public void readFromCSV(List<Employee> employees) {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] attributes = line.split(",");
                Employee employee = createEmployee(attributes);
                employees.add(employee);
            }
        } catch (IOException e) {
            System.out.println("File not found! Error: " + e);
        }
    }

    private Employee createEmployee(String[] attributes) {
        String firstName = attributes[0];
        String lastName = attributes[1];
        int postalCode = Integer.parseInt(attributes[2]);
        String street = attributes[3];
        String district = attributes[4];
        int age = Integer.parseInt(attributes[5]);
        String designation = attributes[6];
        double remuneration = Double.parseDouble(attributes[7]);
        return new Employee(firstName, lastName, postalCode, street, district, age, designation, remuneration);
    }

    public void printEmployees(List<Employee> employees) {
        System.out.println("Total employees: " + employees.size());
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPostalCode() + " " + employee.getStreet() + " " + employee.getDistrict() + " " + employee.getAge() + " " + employee.getDesignation() + " " + employee.getRemuneration());
        }
    }

    public void writeToCSV(Employee employee) {

    }
}
