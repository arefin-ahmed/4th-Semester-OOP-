package arefin;

public class App {

    String name;
    int id;
    double salary;
    String designation;

    // Constructor 1
    Employee(String name) {
        this.name = name;
    }

    // Constructor 2 (Overloaded)
    Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Method 1
    void showEmployee() {
        System.out.println("Name: " + name);
    }

    // Method 2 (Overloaded)
    void showEmployee(boolean full) {
        if (full) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: " + designation);
        }
    }
}
