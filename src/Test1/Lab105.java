package Test1;

import java.util.Scanner;  

public class Lab105 {

    // Method
    //Convert menu number to menu name
    public static String getMenuName(int menuNumber) {

        if (menuNumber == 1) {
            return "Americano";
        } 
        else if (menuNumber == 2) {
            return "Latte";
        } 
        else if (menuNumber == 3) {
            return "Espresso";
        } 
        else if (menuNumber == 4) {
            return "Mocha";
        } 
        else {
            return "Invalid Menu";   // Outside range 1-4
        }
    }

    //main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   

        System.out.print("Enter menu number: ");
        int number = sc.nextInt();               // Get integer input from user
        
        // Use method get menu by number
        String menu = getMenuName(number);

        // Results
        System.out.println(menu);

        sc.close();  
    }
}
