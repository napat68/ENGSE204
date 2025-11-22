package Test1;

import java.util.Scanner;

public class Lab110 {

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);

        System.out.print("Please enter width: ");
        double width   = Number.nextDouble(); 
        
        System.out.print("Please enter height: ");
        double height  = Number.nextDouble();
 
        double area    = calculateArea(width, height);

        System.out.println(area);

        Number.close();
    }
}
