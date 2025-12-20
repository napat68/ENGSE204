package Lab401;

import java.util.Scanner;

class ScoreBoard {

    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {

        try {
            if (gameName == null || gameName.trim().isEmpty()) {
                throw new IllegalArgumentException("gameName can't be empty or null");
            }
        } catch (IllegalArgumentException e) {
            gameName = "Unknown";
        }

        this.gameName = gameName;
        this.scores = scores; 
    }

    public ScoreBoard(ScoreBoard other) {

        String safeName = other.gameName;

        try {
            if (safeName == null || safeName.trim().isEmpty()) {
                throw new IllegalArgumentException("safeName can't be empty or null");
            }
        } catch (IllegalArgumentException e) {
            safeName = "Unknown";
        }

        this.gameName = safeName;

        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Lab414 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gameName = input.nextLine();

        int[] originalScores = new int[3];
        originalScores[0] = input.nextInt();
        originalScores[1] = input.nextInt();
        originalScores[2] = input.nextInt();

        int newScore = input.nextInt();

        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);

        ScoreBoard sb2 = new ScoreBoard(sb1);

        originalScores[0] = newScore;

        sb1.displayScores(); 
        sb2.displayScores(); 

        input.close();
    }
}

