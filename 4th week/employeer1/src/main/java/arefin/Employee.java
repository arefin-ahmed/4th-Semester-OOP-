package arefin;

public class Employee {

    private String name;
    private int id;
    private double salary;
    private String designation;

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
        System.out.println("Designation: " + getDesignation());
        System.out.println();
    }
}
