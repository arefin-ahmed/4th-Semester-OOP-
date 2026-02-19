package arefin;

public class BankAccount
{
    String accountNumber;
    double balance;

    void deposit(double ammount)
    {
        balance += ammount;
        System.out.println("Deposit Successful. Current Balance: " + balance);
    }

    void withdraw(double ammount)
    {
        if (ammount <= balance) 
        {
            balance = balance - ammount;
            System.out.println("Wirthdraw Successful. Current Balance: " + balance);
        }
        else
        {
            System.out.println("Not Enough Balance. Current Balance:" + balance);
        }
    }
    
    void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("");
    }
}
