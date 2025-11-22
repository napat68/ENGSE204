package Test1;

import java.util.Scanner;

public class Lab113 {

    private static int[][] serverGrid;  

    public static int countOnline(int[][] grid) {

        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {

                if (grid[r][c] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int R = input.nextInt();   
        int C = input.nextInt();   

        serverGrid = new int[R][C];   

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                serverGrid[i][j] = input.nextInt();
            }
        }

        int online = countOnline(serverGrid);

        System.out.println(online);

        input.close();
    }
}
