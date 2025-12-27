package Lab501;

import java.util.Scanner;

class PersonLab508 {
    protected String name;

    public PersonLab508(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class StudentLab508 extends PersonLab508 {
    protected int studentId;

    public StudentLab508(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class EmployeeLab508 extends PersonLab508 {
    protected double salary;

    public EmployeeLab508(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        this.salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class Lab508 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String studentName = input.nextLine();
        int studentId = input.nextInt();
        input.nextLine(); 

        String employeeName = input.nextLine();
        double salary = input.nextDouble();

        PersonLab508[] people = new PersonLab508[2];
        people[0] = new StudentLab508(studentName, studentId);
        people[1] = new EmployeeLab508(employeeName, salary);

        for (PersonLab508 p : people) {
            if (p instanceof EmployeeLab508) {
                EmployeeLab508 e = (EmployeeLab508) p;
                e.applyBonus(1000.0);
            }
        }

        for (PersonLab508 p : people) {
            System.out.println(p.getStatus());
        }

        input.close();
    }
}

