package entities;

public class Account {
    private int numberOfAccount;
    private String holder;
    private double balance;

    public Account(int numberOfAccount, String holder) {
        this.holder = holder;
        this.numberOfAccount = numberOfAccount;
    }

    public Account(int numberOfAccount, String holder, double initialBalance) {
        this.numberOfAccount = numberOfAccount;
        this.holder = holder;
        deposit(initialBalance);
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account "
                + numberOfAccount
                + ", holder: "
                + holder
                + ", balance: $ "
                + String.format("%.2f", balance);
    }

    public void deposit(double amount) {
        this.balance += amount ;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }
}
