package Lab301;
import java.util.Scanner;

class User {

    private String username;

    public User(String user) {
        this.username = user;
    }

    public String getUsername() {
        return this.username;
    }
}

public class Lab301 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String user = input.nextLine();

        User u = new User(user);

        System.out.println(u.getUsername());

        input.close();
    }
}


