package Lab201;

class BankAccountLab207 {

 String ownerName;  
 double balance;     

 BankAccountLab207(String ownerName, double initialBalance) {
     this.ownerName = ownerName;
     this.balance   = initialBalance;
 }

 void withdraw(double amount) {

     if (amount <= balance) {
         balance -= amount;
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
     String name = input.nextLine();

     double initial = input.nextDouble();

     double w1      = input.nextDouble();

     double w2      = input.nextDouble();

     BankAccountLab207 account = new BankAccountLab207(name, initial);

     account.withdraw(w1);

     account.withdraw(w2);

     account.displayBalance();

     input.close();
 }
}
