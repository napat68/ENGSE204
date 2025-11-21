package Test1;

import java.util.Scanner;  

public class Lab106 {

    //Method
    // Display multiplication table 1-12 
    public static void printMultiplicationTable(int number) {

        for (int i = 1; i <= 12; i++) {   // Loop 12 round
            int result = number * i;      // Calculate result
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    //main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   

        System.out.print("Enter number: ");
        int num = sc.nextInt();                // Get integer input from user

        // Use method display multiplication table
        printMultiplicationTable(num);

        sc.close(); 
    }
}
