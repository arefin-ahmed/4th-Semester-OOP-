package arefin;

public class Employee {

    String name;
    int id;
    double salary;
    String designation;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int id, double salary, String designation) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}
