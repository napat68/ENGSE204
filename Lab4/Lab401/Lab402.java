package Lab401;

import java.util.Scanner;

class Product {

    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0); 
    }

    public Product(String name, double price) {
        this.name  = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class Lab402 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        input.nextLine(); 

        if (mode == 1) {

            String name     = input.nextLine();
            Product product = new Product(name);
            product.displayInfo();

        } else if (mode == 2) {

            String name     = input.nextLine();
            double price    = input.nextDouble();
            Product product = new Product(name, price);
            product.displayInfo();
        }

        input.close();
    }
}
