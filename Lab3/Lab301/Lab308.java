package Lab301;

import java.util.Scanner;

class InventoryItem {

 private String productName;
 private int stock;

 public InventoryItem(String productName, int initialStock) {
     this.productName = productName;
     if (initialStock >= 0) {
         this.stock = initialStock;
     } else {
         this.stock = 0;
     }
 }

 public String getProductName() {
     return this.productName;
 }

 public int getStock() {
     return this.stock;
 }

 public void addStock(int amount) {
     if (amount > 0) {
         this.stock += amount;
         System.out.println("Stock added.");
         return; 
     }
     System.out.println("Invalid amount.");
 }

 public void sellStock(int amount) {
     if (amount <= 0) {
         System.out.println("Invalid amount.");
         return; 
     }

     if (amount <= this.stock) {
         this.stock -= amount;
         System.out.println("Sale successful.");
         return; 
     }

     System.out.println("Not enough stock.");
 }
}

public class Lab308 {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     String productName = input.nextLine(); 
     int initialStock = input.nextInt();    
     int n = input.nextInt();               

     InventoryItem item = new InventoryItem(productName, initialStock);

     for (int i = 0; i < n; i++) {
         String cmd = input.next();   
         int amount = input.nextInt();

         if (cmd.equals("ADD")) {
             item.addStock(amount);
         } else if (cmd.equals("SELL")) {
             item.sellStock(amount);
         }
     }

     System.out.println("Final Stock: " + item.getStock());

     input.close();
 }
}

