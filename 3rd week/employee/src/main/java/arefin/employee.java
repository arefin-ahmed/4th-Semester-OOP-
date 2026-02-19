package arefin;

public class employee 
{
    String name;
    int age;
    String designation;
    double salary;

    static String companyName = "ABC Ltd";
    static String companyAddress = "Dhaka";
    static int totalEmployees = 0;

    employee(String name, int age, String designation, double salary) 
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        totalEmployees++; 
    }

    void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println("Address: " + companyAddress);
        System.out.println("");
    }
    static void showTotalEmployees() 
    {
        System.out.println("Total Employees: " + totalEmployees);
    }

}
