package Lab201;
		
class Student {

 String studentId;  
 String name;        

 Student(String studentId, String name) {
     this.studentId = studentId;
     this.name      = name;
 }

 String getInfo() {
     return studentId + "\n" + name;
 }
}

public class Lab201 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
     String id    =  input.nextLine();
     String name  =  input.nextLine();
     Student std  =  new Student(id, name);

     System.out.println(std.getInfo());

     input.close();
 }
}



