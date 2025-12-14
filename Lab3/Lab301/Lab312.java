package Lab301;

import java.util.Scanner;

class EmployeeLab312 {

    private String name;
    private double monthlySalary;

    public EmployeeLab312(String name, double monthlySalary) {
        this.name = name;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class Lab312 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double monthlySalary = input.nextDouble();
        double taxRate = input.nextDouble();
        double raiseAmount = input.nextDouble();

        EmployeeLab312 emp = new EmployeeLab312(name, monthlySalary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        input.close();
    }
}

