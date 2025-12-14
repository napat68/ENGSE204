package Lab301;

import java.util.Scanner;

class BankAccount {

 private double balance;

 public BankAccount(double initialBalance) {
     if (initialBalance >= 0) {
         this.balance = initialBalance;
     } else {
         this.balance = 0;
     }
 }

 public double getBalance() {
     return this.balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         this.balance += amount;
         System.out.println("Deposit successful.");
         return; 
     }
     System.out.println("Invalid deposit amount.");
 }

 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
         return; 
     }

     if (amount <= this.balance) {
         this.balance -= amount;
         System.out.println("Withdrawal successful.");
         return; 
     }

     System.out.println("Insufficient funds.");
 }
}

public class Lab306 {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     double initialBalance = input.nextDouble();
     double depositAmount  = input.nextDouble();
     double withdrawAmount = input.nextDouble();

     BankAccount acc = new BankAccount(initialBalance);

     acc.deposit(depositAmount);
     acc.withdraw(withdrawAmount);

     System.out.println("Final Balance: " + acc.getBalance());

     input.close();
 }
}

