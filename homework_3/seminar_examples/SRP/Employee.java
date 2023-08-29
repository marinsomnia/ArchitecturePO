package homework_3.seminar_examples.SRP;

public class Employee {

    private String name;
    private String date;

    public Employee(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getEmpInfo() {
        return "name: " + name + " date: " + date;
    }
    
}
