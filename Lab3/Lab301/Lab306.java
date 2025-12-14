package Lab301;

import java.util.Scanner;

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
            return;
        }

        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }
}

public class Lab306 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double initialBalance = input.nextDouble();
        double depositAmount  = input.nextDouble();
        double withdrawAmount = input.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        account.deposit  (depositAmount);
        account.withdraw (withdrawAmount);

        System.out.println("Final Balance: " + account.getBalance());

        input.close();
    }
}
