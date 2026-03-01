package arefin;

public class Account1 {
    int accNumber;
    String name;
    double balance;

    // Constructor
    public Account1(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    // Display Method
    public void display() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }
}

