package arefin;

public class Savings extends Account implements Transaction {
    String acc;
    double bal;

    Savings(String acc, double bal) {
        super(acc, bal);
    }

    public void deposit(double amount) {
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawn: " + amount);
    }
}
