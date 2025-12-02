package Lab201;

class StudentLab203 {

 String studentId;  
 String name;      

 static int studentCount = 0;

 StudentLab203(String studentId, String name) {
     this.studentId = studentId;
     this.name      = name;

     studentCount++;
 }

 void displayInfo() {
     System.out.println(studentId);
     System.out.println(name);
 }
}

public class Lab203 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     int N = input.nextInt();
     input.nextLine();  

     for (int i = 0; i < N; i++) {
         String id   = input.nextLine();    
         String name = input.nextLine();  
         new StudentLab203(id, name);          
     }

     System.out.println(StudentLab203.studentCount);

     input.close();
 }
}

