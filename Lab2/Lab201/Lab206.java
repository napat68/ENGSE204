package Lab201;

class BankAccount {

 String ownerName;   
 double balance;   

 BankAccount(String ownerName, double initialBalance) {
     this.ownerName = ownerName;
     this.balance = initialBalance;
 }

 void deposit(double amount) {
     balance += amount;
 }

 void displaySummary() {
     System.out.println("Owner: " + ownerName);
     System.out.println("Balance: " + balance);
 }
}

public class Lab206 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String name = input.nextLine();

     double initial = input.nextDouble();

     double amount  = input.nextDouble();

     BankAccount account = new BankAccount(name, initial);

     account.deposit(amount);

     account.displaySummary();

     input.close();
 }
}
