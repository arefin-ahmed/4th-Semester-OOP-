package arefin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new FullTimeEmployee("Alice", 101, 5000));
        staff.add(new Contractor("Bob", 102, 50, 160));

        for (Employee e : staff) {

            double pay = ((SalaryCalculator) e).calculateSalary();
            System.out.println("ID: " + e.employeeId + " | Name: " + e.name + " | Pay: $" + pay);
        }
    }
}
