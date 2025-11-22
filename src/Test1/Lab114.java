package Test1;

import java.util.Scanner;

public class Lab114 {

    private static int rows;
    private static int cols;
    private static char[][] map;
    
    private static boolean inBounds(int r, int c) {
        return (r >= 0 && r < rows && c >= 0 && c < cols);
    }

    private static int countAdjacentMines(int r, int c) {

        int count = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {

                if (dr == 0 && dc == 0) {
                    continue;
                }

                int nr = r + dr;
                int nc = c + dc;

                if (inBounds(nr, nc) && map[nr][nc] == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        rows = input.nextInt();
        cols = input.nextInt();

        map = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            String line = input.next();
            for (int c = 0; c < cols; c++) {
                map[r][c] = line.charAt(c);
            }
        }

        int targetR = input.nextInt();
        int targetC = input.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int mines = countAdjacentMines(targetR, targetC);
            System.out.println(mines);
        }

        input.close();
    }
}
