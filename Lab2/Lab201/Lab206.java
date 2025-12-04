package Lab201;

class BankAccount {

    String ownerName;    
    double balance;      

    BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance   = initialBalance;
    }

    void deposit(double amountToDeposit) {
        balance = balance + amountToDeposit;
    }

    void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class Lab206 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String accountOwnerName = input.nextLine();
        double initialBalance   = input.nextDouble();
        double depositAmount    = input.nextDouble();

        BankAccount account = new BankAccount(accountOwnerName, initialBalance);

        account.deposit(depositAmount);
        account.displaySummary();

        input.close();
    }
}
