package arefin;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahim", 101, 30000, "Manager");
        Employee e2 = new Employee("Karim", 102, 25000, "Assistant");

        e1.display();
        e2.display();

        e1.setSalary(45000);
        e1.setDesignation("Senior Manager");

        System.out.println("After Salary Update:");
        e1.display();
    }

}
