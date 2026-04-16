package arefin;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();

        list.add(new Savings("123", 5000));
        list.add(new Savings("456", 8000));

        for (Account acc : list) {
            System.out.println("Account No: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());

            acc.deposit(1000);
            acc.withdraw(500);

            System.out.println("-------------------");
        }
    }
}
