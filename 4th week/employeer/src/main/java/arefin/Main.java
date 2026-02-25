package arefin;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Arefin");
        Employee e2 = new Employee("Sami", 101, 30000, "Manager");

        e1.display();
        System.out.println();
        e2.displayFull();
    }

}
