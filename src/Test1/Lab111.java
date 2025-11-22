package Test1;

import java.util.Scanner;

public class Lab111 {

    private static int[] data;

    public static int sumArray(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
             sum += numbers[i];
        }

        return sum;  
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);

        int n = Number.nextInt();     
        data  = new int[n];        

        for (int i  = 0; i < n; i++) {
        	data[i] = Number.nextInt();
        }

        int result  = sumArray(data);

        System.out.println(result);

        Number.close();
    }
}

