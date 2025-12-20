package Lab401;

import java.util.Scanner;

class TimePeriod {

    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {

        try {

            if (startHour < 0 || startHour > 23 || endHour < 0 || endHour > 23) {
                throw new IllegalArgumentException("Invalid hour range");
            }
        } catch (IllegalArgumentException e) {

            if (startHour < 0) startHour = 0;
            if (startHour > 23) startHour = 23;
            if (endHour < 0) endHour = 0;
            if (endHour > 23) endHour = 23;
        }

        if (startHour > endHour) {
            int temp  = startHour;
            startHour = endHour;
            endHour   = temp;
        }

        this.startHour = startHour;
        this.endHour   = endHour;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class Lab410 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mode = input.nextInt();
        TimePeriod period;

        if (mode == 1) {

            period = new TimePeriod();
        } else {
            int start = input.nextInt();
            int end = input.nextInt();
            period = new TimePeriod(start, end);
        }

        period.displayPeriod();
        input.close();
    }
}
