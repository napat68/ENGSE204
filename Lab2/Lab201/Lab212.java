package Lab201;

class Course {

 private String id;     
 private String name;     

 Course(String id, String name) {
     this.id   = id;
     this.name = name;
 }

 public String getCourseInfo() {
     return id + ": " + name;
 }
}

class StudentLab212 {

 private String studentName;  
 private Course enrolled;  

 StudentLab212(String studentName, Course enrolled) {
     this.studentName = studentName;
     this.enrolled    = enrolled;
 }

 public void displayEnrollment() {
     System.out.println("Student: " + studentName);
     System.out.println("Enrolled in: " + enrolled.getCourseInfo());
 }
}

public class Lab212 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String id      = input.nextLine();
     String subject = input.nextLine();
     String name    = input.nextLine();

     Course courseObj = new Course(id, subject);

     StudentLab212 std = new StudentLab212(name, courseObj);

     std.displayEnrollment();

     input.close();
 }
}
