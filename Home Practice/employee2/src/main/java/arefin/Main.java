package arefin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine(); // Important to avoid skipping

        // Array of objects
        Employee2[] emp = new Employee2[n];

        // Taking input
        for (int i = 0; i < n; i++) {

            System.out.println("Enter name of employee " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter salary of employee " + (i + 1) + ":");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            emp[i] = new Employee2(name, salary);
        }

        // Displaying all employees
        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
