package Lab301;

import java.util.Scanner;

class Player {

    private int score;

    public Player(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class Lab302 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int initialScore = input.nextInt();
        int newScore     = input.nextInt();    

        Player p1 = new Player(initialScore); 
        p1.setScore(newScore);               

        System.out.println(p1.getScore());   

        input.close();
    }
}
