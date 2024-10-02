package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {

            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);

        } else {
            account = new Account(accountNumber,accountHolder);
        }

        System.out.println("Account data:");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        System.out.println("Updated account data: ");
        account.deposit(depositAmount);
        System.out.println(account.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawAmount = sc.nextDouble();
        System.out.println("Updated account data: ");
        account.withdraw(withdrawAmount);
        System.out.println(account.toString());

        sc.close();
    }
}