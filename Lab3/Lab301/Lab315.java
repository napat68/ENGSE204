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

    private static int readIntLine(Scanner sc) {
        return Integer.parseInt(sc.nextLine().trim());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = input.nextLine();
        UserLab315 user = new UserLab315(username);

        int n = readIntLine(input);

        for (int i = 0; i < n; i++) {
            String command = input.nextLine().trim();

            if (command.equals("SET_POLICY")) {
                int max = readIntLine(input);
                UserLab315.setPolicy(max);

            } else if (command.equals("LOGIN")) {
                String password = input.nextLine();
                user.login(password);
            }
        }

        input.close();
    }
}