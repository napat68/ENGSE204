package Test1;

import java.util.Scanner;

public class Lab108 {
    private static int[] numbers;

    private static int findMaximum(int[] data) {

        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {   
                max = data[i];    
            }
        }
        
        return max;   
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);

        int n = Number.nextInt();             

        numbers = new int[n];               

        for (int i = 0; i < n; i++) {
            numbers[i] = Number.nextInt();
        }

        int maxValue = findMaximum(numbers);

        System.out.println(maxValue);

        Number.close();  
    }
}
