package Lab501;

import java.util.Scanner;

class ProjectTaskLab510 {
    protected String description;
    protected int baseHours;

    public ProjectTaskLab510(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTaskLab510 extends ProjectTaskLab510 {
    protected double setupFee;

    public ComplexTaskLab510(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTaskLab510 extends ProjectTaskLab510 {

    public SimpleTaskLab510(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Lab510 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String complexDesc = input.nextLine();
        int complexHours = input.nextInt();
        double setupFee = input.nextDouble();
        input.nextLine(); 

        String simpleDesc = input.nextLine();
        int simpleHours = input.nextInt();

        ProjectTaskLab510[] tasks = new ProjectTaskLab510[2];
        tasks[0] = new ComplexTaskLab510(complexDesc, complexHours, setupFee);
        tasks[1] = new SimpleTaskLab510(simpleDesc, simpleHours);

        for (ProjectTaskLab510 task : tasks) {
            System.out.println(task.calculateCost());
        }

        input.close();
    }
}

