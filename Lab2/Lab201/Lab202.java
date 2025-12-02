package Lab201;

class Student {

 String studentId;   
 String name;        

 Student(String studentId, String name) {
     this.studentId = studentId;
     this.name      = name;
 }

 void displayInfo() {
     System.out.println(studentId);
     System.out.println(name);
 }
}

public class Lab202 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String id   = input.nextLine();
     String name = input.nextLine();

     Student std = new Student(id, name);

     std.displayInfo();

     input.close();
 }
}
