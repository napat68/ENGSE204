package Test1;

import java.util.Scanner;  

public class Lab105 {

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
            return "Invalid Menu";  
        }
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);   

        System.out.print("Please enter menu number: ");
        int number = Number.nextInt();              
        
        String menu = getMenuName(number);

        System.out.println(menu);

        Number.close();  
    }
}
