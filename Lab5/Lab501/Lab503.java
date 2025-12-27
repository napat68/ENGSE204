package Lab501;

import java.util.Scanner;

class Employee {

    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus(); 
        return baseBonus + (salary * 0.05);        
    }
}

public class Lab503 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();

        Manager manager = new Manager();
        manager.salary  = salary;

        System.out.println(manager.calculateBonus());

        input.close();
    }
}

