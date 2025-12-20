package Lab401;

import java.util.Scanner;

class Player {

    private String username;
    private int level;

    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Lab403 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        input.nextLine(); 

        Player player;

        if (mode == 1) {
            player = new Player();
        } else {
            String username = input.nextLine();
            int level = input.nextInt();
            player = new Player(username, level);
        }

        player.displayProfile();
        input.close();
    }
}
