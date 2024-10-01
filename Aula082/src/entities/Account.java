package entities;

public class Account {
    final int numberOfAccount;
    String holder;
    double balance;

    public Account(int numberOfAccount, String holder) {
        this.holder = holder;
        this.numberOfAccount = numberOfAccount;
    }

    public Account(int numberOfAccount, String holder, double balance) {
        this.numberOfAccount = numberOfAccount;
        this.holder = holder;
        this.balance = balance;
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

    public void statusAccount() {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", getNumberOfAccount(), getHolder(), getBalance());
    }

    public void deposit(double amount) {
        this.balance += amount ;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        this.balance -= 5;
    }
}
