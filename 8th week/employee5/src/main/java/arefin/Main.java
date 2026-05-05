package arefin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Arefin", 101, 50000, 8000));
        employees.add(new Engineer("Nadia", 102, 45000, 5000));
        employees.add(new Manager("Rafi", 103, 52000, 7000));
        employees.add(new Engineer("Sami", 104, 48000, 4500));

        for (Employee e : employees) {
            e.display();
            System.out.println("----");
        }
    }
}
