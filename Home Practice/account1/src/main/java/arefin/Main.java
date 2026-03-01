package arefin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account1[] accounts = new Account1[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Account Number:");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Balance:");
            double balance = sc.nextDouble();

            accounts[i] = new Account1(accNo, name, balance);
        }

        System.out.println("\n--- Account Details ---");
        for (int i = 0; i < 3; i++) {
            accounts[i].display();
        }
    }
}
