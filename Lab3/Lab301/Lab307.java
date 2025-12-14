package Lab301;

import java.util.Scanner;

class EmployeeLab307 {

    private String employeeId;

    private String department;

    public EmployeeLab307(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }
}

public class Lab307 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String empId = input.nextLine();
        String startDept = input.nextLine();
        String newDept = input.nextLine();

        EmployeeLab307 employee = new EmployeeLab307(empId, startDept);

        employee.setDepartment(newDept);

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getDepartment());

        input.close();
    }
}


