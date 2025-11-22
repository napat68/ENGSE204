package Test1;

import java.util.Scanner;

public class Lab107 {

    public static int sumNumbers(int n, Scanner Number) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Number.nextInt();   
            sum += num;               
        }

        return sum;  
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);

        System.out.print("Please enter N: ");
        int n = Number.nextInt();             

        int result = sumNumbers(n, Number);   

        System.out.println(result);       

        Number.close();
    }
}
