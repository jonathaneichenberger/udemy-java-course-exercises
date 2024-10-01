package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Account account = null;
        double depositAmount = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String response = sc.next();

        if (response.toLowerCase().charAt(0) == 'y') {

            System.out.print("Enter initial deposit value: ");
            depositAmount = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, depositAmount);

        } else {
            account = new Account(accountNumber,accountHolder);
        }

        System.out.println("Account data:");
        account.statusAccount();
        System.out.println();

        System.out.print("Enter a deposit value: ");
        depositAmount = sc.nextDouble();
        System.out.println("Updated account data: ");
        account.deposit(depositAmount);
        account.statusAccount();

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        depositAmount = sc.nextDouble();
        System.out.println("Updated account data: ");
        account.withdraw(depositAmount);
        account.statusAccount();

        sc.close();
    }
}