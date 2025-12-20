package Lab401;

import java.util.Scanner;

class Subscription {

    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {

        try {
            if (planName == null || planName.trim().isEmpty()) {
                throw new IllegalArgumentException("Error planName can't be empty or null.");
            }
        } catch (IllegalArgumentException e) {

            planName = "Unknown";
        }

        if (durationDays > maxDuration) {
            durationDays = maxDuration;
        }
        if (durationDays < 0) {
            durationDays = 0;
        }

        this.planName = planName;
        this.durationDays = durationDays;
    }

    public Subscription(Subscription other) {
        this(other.planName, other.durationDays);
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + max);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {

        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;

        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class Lab413 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = input.nextInt();
        input.nextLine(); 
        Subscription.setMaxDuration(max);

        String planName = input.nextLine();
        int initialDays = input.nextInt();
        int ext1 = input.nextInt();
        int ext2 = input.nextInt();

        Subscription s1 = new Subscription(planName, initialDays);
        Subscription s2 = s1.extend(ext1);
        Subscription s3 = s2.extend(ext2);

        s3.displayInfo();

        input.close();
    }
}

