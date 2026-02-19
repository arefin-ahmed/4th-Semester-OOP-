package arefin;

public class Main {
    public static void main(String[] args)
    {
        BankAccount ac1 = new BankAccount();
        ac1.accountNumber = "1231";
        ac1.deposit(1000);
        ac1.withdraw(500);
        ac1.display();
    }
}
