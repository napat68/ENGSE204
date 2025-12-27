package Lab501;

import java.util.Scanner;

class EmployeeLab507 {
    protected String name;
    protected double baseSalary;

    public EmployeeLab507(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployeeLab507 extends EmployeeLab507 {
    protected double commissionRate;

    public SalesEmployeeLab507(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class ManagerLab507 extends EmployeeLab507 {
    protected double fixedBonus;

    public ManagerLab507(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessorLab507 {
    public static void process(EmployeeLab507 e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Lab507 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String salesName = input.nextLine();
        double salesSalary = input.nextDouble();
        double commissionRate = input.nextDouble();
        input.nextLine(); 

        String managerName = input.nextLine();
        double managerSalary = input.nextDouble();
        double fixedBonus = input.nextDouble();

        SalesEmployeeLab507 sales = new SalesEmployeeLab507(salesName, salesSalary, commissionRate);
        ManagerLab507 manager = new ManagerLab507(managerName, managerSalary, fixedBonus);

        PayrollProcessorLab507.process(sales);
        PayrollProcessorLab507.process(manager);

        input.close();
    }
}

