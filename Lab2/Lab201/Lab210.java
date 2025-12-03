package Lab201;

class Product {

 String name;   
 double cost;   

 Product(String name, double cost) {
     this.name = name;
     this.cost = cost;
 }
}

class ShoppingCart {

 Product[] items;   
 int itemCount;    

 ShoppingCart() {
     items = new Product[10]; 
     itemCount = 0;          
 }

 void addProduct(Product p) {
     items[itemCount] = p; 
     itemCount++;           
 }

 double calculateTotalPrice() {
     double sum = 0.0;

     for (int i = 0; i < itemCount; i++) {
         sum += items[i].cost;
     }

     return sum;
 }
}

public class Lab210 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     int n = input.nextInt();
     input.nextLine();  

     ShoppingCart cart = new ShoppingCart();

     for (int i = 0; i < n; i++) {

         String productName  = input.nextLine(); 
         double productCost = input.nextDouble(); 
         input.nextLine();  

         Product item = new Product(productName, productCost);

         cart.addProduct(item);
     }

     double total = cart.calculateTotalPrice();
     System.out.println(total);

     input.close();
 }
}

