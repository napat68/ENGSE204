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
     return this.employeeId;
 }

 public String getDepartment() {
     return this.department;
 }

 public void setDepartment(String newDepartment) {
     this.department = newDepartment;
 }
}

public class Lab307 {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     String empId          = input.nextLine();
     String startDept      = input.nextLine(); 
     String newDepartment  = input.nextLine(); 

     EmployeeLab307 emp = new EmployeeLab307(empId, startDept);

     emp.setDepartment(newDepartment);

     System.out.println(emp.getEmployeeId());
     System.out.println(emp.getDepartment());

     input.close();
 }
}

