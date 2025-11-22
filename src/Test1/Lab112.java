package Test1;

import java.util.Scanner;

public class Lab112 {

    private static int[] productID;
    private static int[] stockQty;
    
    public static int searchProduct(int[] idArray, int searchID) {

        for (int i = 0; i < idArray.length; i++) {
            if (idArray[i] == searchID) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        productID = new int[n];
        stockQty  = new int[n];

        for (int i = 0; i < n; i++) {
            productID[i] = input.nextInt();
            stockQty[i]  = input.nextInt();
        }

        int searchID = input.nextInt();
        int index    = searchProduct(productID, searchID);

        if (index != -1) {
            System.out.println(stockQty[index]);
        } else {
            System.out.println("Product " + searchID + " not found");
        }

        input.close();
    }
}


