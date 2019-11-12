package zadanie1;

import java.io.FileNotFoundException;

public class EmployeeTest {

    public static void main(String[] args) {
        try {
            Employee[] employees = FileUtils.read("employee.csv");
            System.out.println("Najmniejsza wypłata: " + EmployeeControl.minSalary(employees));
            System.out.println("Średnia wypłata: " + EmployeeControl.mediumSalary(employees));
            System.out.println("Największa wypłata: " + EmployeeControl.maxSalary(employees));

            System.out.println("Liczba pracowników: It: "
                    + EmployeeControl.numberOfEmployee(employees, "it"));
            System.out.println("Liczba pracowników: Support: "
                    + EmployeeControl.numberOfEmployee(employees, "Support"));
            System.out.println("Liczba pracowników: Management: "
                    + EmployeeControl.numberOfEmployee(employees, "Management"));

            System.out.println("--------------------------------------------------------");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak wskazanego pliku");
        }
    }
}
