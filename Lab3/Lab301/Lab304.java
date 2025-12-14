package Lab301;

import java.util.Scanner;

class ProductWithStaticCounterEncapsulation {

 private String name;

 private static int productCount = 0;

 public ProductWithStaticCounterEncapsulation(String name) {
     this.name = name;
     productCount++;
 }

 public String getName() {
     return this.name;
 }

 public static int getProductCount() {
     return productCount;
 }
}

public class Lab304 {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     int n = input.nextInt();
     input.nextLine(); 

     for (int i = 0; i < n; i++) {
         String productName = input.nextLine();
         new ProductWithStaticCounterEncapsulation(productName);
     }

     System.out.println(
         ProductWithStaticCounterEncapsulation.getProductCount()
     );

     input.close();
 }
}


