public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Arefin");
        Employee e2 = new Employee("Siam", 101, 30000, "Manager");

        e1.showEmployee();
        System.out.println();
        e2.showEmployee(true);
    }

}
