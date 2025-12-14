package Lab301;

import java.util.Scanner;

class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max <= 0) {
            System.out.println("Invalid max value.");
            return;
        }

        if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
            return;
        }

        maxLicenses = max;
        System.out.println("Max licenses set to " + maxLicenses);
    }

    public static boolean checkOut() {
        if (usedLicenses >= maxLicenses) {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }

        usedLicenses++;
        System.out.println("Checkout successful.");
        return true;
    }

    public static void checkIn() {
        if (usedLicenses <= 0) {
            System.out.println("Nothing to check-in.");
            return;
        }

        usedLicenses--;
        System.out.println("Check-in successful.");
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class Lab313 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String command = input.nextLine().trim();
            processCommand(command, input);
        }

        input.close();
    }

    private static void processCommand(String command, Scanner input) {

        switch (command) {
            case "SET":
                handleSetCommand(input);
                break;

            case "CHECKOUT":
                LicenseManager.checkOut();
                break;

            case "CHECKIN":
                LicenseManager.checkIn();
                break;

            case "STATUS":
                LicenseManager.displayStatus();
                break;

            default:

                break;
        }
    }

    private static void handleSetCommand(Scanner input) {

        int max = input.nextInt();
        input.nextLine();

        LicenseManager.setMax(max);
    }
}


