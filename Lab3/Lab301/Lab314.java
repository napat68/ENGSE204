package Lab301;

import java.util.Scanner;

class BankAccountLab314{

    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccountLab314(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        this.balance += amount;
        totalTransactionCount++;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return; 
        }

        if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return; 
        }

        this.balance -= amount;
        totalTransactionCount++;
        System.out.println("Withdrawal successful.");
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class Lab314 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount myAccount = null;

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String cmd = input.nextLine();

            if (cmd.equals("CREATE")) {
                double initial = input.nextDouble();
                input.nextLine();
                myAccount = new BankAccount(initial);

            } else if (cmd.equals("DEPOSIT")) {
                double amount = input.nextDouble();
                input.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                    continue;
                }
                myAccount.deposit(amount);

            } else if (cmd.equals("WITHDRAW")) {
                double amount = input.nextDouble();
                input.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                    continue;
                }
                myAccount.withdraw(amount);

            } else if (cmd.equals("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }

            } else if (cmd.equals("GLOBAL_STATUS")) {
                System.out.println("Total Transactions: " + BankAccountLab314.getTotalTransactionCount());
            }
        }

        input.close();
    }
}
