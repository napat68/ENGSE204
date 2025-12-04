package Lab201;

class BankAccountLab207 {

    String ownerName;     
    double balance;      

    BankAccountLab207(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    void withdraw(double amountToWithdraw) {

        if (amountToWithdraw <= balance) {
            balance = balance - amountToWithdraw;
            System.out.println("Withdrawal successful.");
        }

        else {
            System.out.println("Insufficient funds.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Lab207 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String accountOwnerName = input.nextLine();

        double initialBalance       = input.nextDouble();
        double firstWithdrawAmount  = input.nextDouble();
        double secondWithdrawAmount = input.nextDouble();

        BankAccountLab207 account = new BankAccountLab207(accountOwnerName, initialBalance);

        account.withdraw(firstWithdrawAmount);
        account.withdraw(secondWithdrawAmount);

        account.displayBalance();

        input.close();
    }
}
