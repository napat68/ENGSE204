package Lab401;

import java.util.Scanner;

class ImmutableAccount {

    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {

        if (accountId == null || accountId.trim().isEmpty()) {
            throw new IllegalArgumentException("Error accountId can't be empty or null.");
        }

        if (balance < 0.0) {
            balance = 0.0;
        }

        this.accountId = accountId;
        this.balance = balance;
    }

    public ImmutableAccount(ImmutableAccount other) {
        this(other.accountId, other.balance);
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public ImmutableAccount deposit(double amount) {

        if (amount <= 0.0) {
            System.out.println("Invalid deposit amount.");
            return this;
        }

        return new ImmutableAccount(this.accountId, this.balance + amount);
    }

    public ImmutableAccount withdraw(double amount) {

        if (amount <= 0.0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }

        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return this;
        }

        return new ImmutableAccount(this.accountId, this.balance - amount);
    }

    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

public class Lab409 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String id = input.nextLine();
        double initialBalance = input.nextDouble();
        double depositAmount  = input.nextDouble();
        double withdrawAmount = input.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);
        ImmutableAccount acc2 = acc1.deposit(depositAmount);
        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        acc1.displayInfo();
        acc3.displayInfo();

        input.close();
    }
}
