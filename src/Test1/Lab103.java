package Test1;

import java.util.Scanner;   

public class Lab103 {

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);  

        System.out.print("Please enter number: ");
        int num = Number.nextInt();               
        
        if (num % 2 == 1) {                   
            System.out.println("Odd");
        } else {                              
            System.out.println("Even");
        }

        Number.close();
    }
}

