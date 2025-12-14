package Lab301;

import java.util.Scanner;

class UserLab315 {

    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public UserLab315(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public static void setPolicy(int max) {
        if (max <= 0) {
            System.out.println("Invalid policy.");
            return;
        }

        maxAttempts = max;
        System.out.println("Policy updated.");
    }

    public void login(String password) {

        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if ("pass123".equals(password)) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            return;
        }

        failedAttempts++;

        if (failedAttempts >= maxAttempts) {
            isLocked = true;
            System.out.println("Login failed. Account locked.");
            return;
        }

        int left = maxAttempts - failedAttempts;
        System.out.println("Login failed. " + left + " attempts left.");
    }
}

public class Lab315 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = input.nextLine().trim();
        UserLab315 user = new UserLab315(username);

        int n = Integer.parseInt(input.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String command = input.nextLine().trim();
            processCommand(command, input, user);
        }

        input.close();
    }

    private static void processCommand(String command, Scanner input, UserLab315 user) {

        switch (command) {
            case "LOGIN":
                handleLogin(input, user);
                break;

            case "SET_POLICY":
                handleSetPolicy(input);
                break;

            default:

                break;
        }
    }

    private static void handleLogin(Scanner input, UserLab315 user) {

        String password = input.nextLine().trim();
        user.login(password);
    }

    private static void handleSetPolicy(Scanner input) {

        int max = Integer.parseInt(input.nextLine().trim());
        UserLab315.setPolicy(max);
    }
}
