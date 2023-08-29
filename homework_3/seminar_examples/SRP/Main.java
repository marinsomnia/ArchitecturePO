package homework_3.seminar_examples.SRP;

public class Main {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Ivanov", "12.12.1990");
        System.out.println(employee1.getEmpInfo());
        EmployeeCalculateSalary salary1 = new EmployeeCalculateSalary(25000);
        System.out.println(salary1.calculateNetSalary());
    }
}