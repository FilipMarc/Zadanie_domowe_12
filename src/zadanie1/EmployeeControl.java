package zadanie1;

public class EmployeeControl {

     static double minSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();

        for (Employee empl : employees) {
            if (empl.getSalary() < minSalary) {
                minSalary = empl.getSalary();
            }
        }
        return minSalary;
    }

     static double mediumSalary(Employee[] employees){
        double sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum/employees.length;
    }

     static double maxSalary(Employee[] employees) {
        double maxSalary = 0;

        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }


    static int numberOfEmployee (Employee[] employees, String department) {
        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(department)) {
                count++;
            }
        }
        return count;
    }
}
