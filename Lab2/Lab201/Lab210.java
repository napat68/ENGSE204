package Lab201;

class Product {


    String name;      
    double cost;      

    Product(String productName, double productCost) {
        this.name = productName;
        this.cost = productCost;
    }
}

class ShoppingCart {

    Product[] items;    
    int itemCount;       

    ShoppingCart() {
        items = new Product[10]; 
        itemCount = 0;
    }

    void addProduct(Product product) {
        items[itemCount] = product;
        itemCount++;
    }

    double calculateTotalPrice() {

        double totalCost = 0.0;

        for (int index = 0; index < itemCount; index++) {
            totalCost += items[index].cost;
        }

        return totalCost;
    }
}

public class Lab210 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        int itemTotal = input.nextInt();
        input.nextLine(); 

        ShoppingCart cart = new ShoppingCart();

        for (int index = 0; index < itemTotal; index++) {

            String productName = input.nextLine();
            double productCost = input.nextDouble();
            input.nextLine(); 

            Product product = new Product(productName, productCost);

            cart.addProduct(product);
        }

        double total = cart.calculateTotalPrice();

        System.out.println(total);

        input.close();
    }
}
