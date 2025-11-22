package Test1;

import java.util.Scanner;

public class Lab109 {

    private static double[] nums; 

    public static double average(double[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
             sum += data[i];
        }

        return sum / data.length;
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);

        int n = Number.nextInt();      
        nums  = new double[n];     

        for (int i  = 0; i < n; i++) {
            nums[i] = Number.nextDouble();   
        }

        double result = average(nums);  

        System.out.println(result);     

        Number.close();
    }
}
