package Lab401;

import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) { this.hour = hour; }

    public void setHour(int newHour) { this.hour = newHour; }

    public int getHour() { return hour; }

    public Schedule(Schedule other) { this.hour = other.hour; }
}

class EmployeeSchedule {

    private String name;
    
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Error name can't be empty or null.");
        }

        this.name     = name;
        
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {

        if (other.name == null || other.name.trim().isEmpty()) {
            throw new IllegalArgumentException("Error other can't be empty or null.");
        }

        this.name = other.name;

        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }
}

public class Lab412 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int startHour = input.nextInt();
        int newHour = input.nextInt();

        Schedule sch1 = new Schedule(startHour);

        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);

        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        sch1.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();

        input.close();
    }
}
