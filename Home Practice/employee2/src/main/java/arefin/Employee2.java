package arefin;

public class Employee2 {

    String name;
    double salary;

    // Constructor
    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }
}
