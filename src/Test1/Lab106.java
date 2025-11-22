package Test1;

import java.util.Scanner;  

public class Lab106 {

    public static void printMultiplicationTable(int number) {

        for (int i = 1; i <= 12; i++) {  
            int result = number * i;     
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);   

        System.out.print("Enter number: ");
        int num = Number.nextInt();              

        printMultiplicationTable(num);

        Number.close(); 
    }
}
