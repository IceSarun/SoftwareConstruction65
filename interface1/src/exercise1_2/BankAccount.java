package exercise1_2;

public class BankAccount implements Comparable{
    private double balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public int compareTo(Object other) {
        BankAccount others = (BankAccount) other;
        if (this.balance < others.balance) {return -1;}
        if (this.balance == others.balance) {return 0;}
        return 1;
    }
}
