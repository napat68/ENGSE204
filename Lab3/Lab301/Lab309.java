package Lab301;

import java.util.Scanner;

class UserLab309 {

    private String usernameLab;
    private String password;

    private static int minPasswordLength = 8;

    public UserLab309(String username, String password) {
        this.usernameLab = username;

        if (password.length() > minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsernameLab() {
        return this.usernameLab;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() > minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
            return;
        }
        System.out.println("Update failed.");
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
            return;
        }
        minPasswordLength = length;
        System.out.println("New min length set to " + length);
    }

    public static int getMinLength() {
        return minPasswordLength;
    }
}

public class Lab309 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minLength1 = input.nextInt();
        input.nextLine();
        UserLab309.setMinLength(minLength1);

        String user1Name = input.nextLine();
        String user1Pass = input.nextLine();
        UserLab309 user1 = new UserLab309(user1Name, user1Pass);

        String user2Name = input.nextLine();
        String user2Pass = input.nextLine();
        UserLab309 user2 = new UserLab309(user2Name, user2Pass);

        int minLength2 = input.nextInt();
        input.nextLine();
        UserLab309.setMinLength(minLength2);

        String user2NewPass = input.nextLine();
        user2.setPassword(user2NewPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        input.close();
    }
}



