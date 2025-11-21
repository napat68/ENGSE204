package Test1;

import java.util.Scanner;   

public class Lab103 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Get input from keyboard

        System.out.print("Enter number: ");
        int num = sc.nextInt();               // Read numeric from user
        
        // Checked even or odd
        if (num % 2 == 0) {                   // If divisible by 2-> even
            System.out.println("Even");
        } else {                              // If not divisible by 2-> odd
            System.out.println("Odd");
        }

        sc.close();
    }
}

