package Lab201;
class StudentLab202 {

    String studentId;  
    String studentName; 

    StudentLab202(String idValue, String nameValue) {
        this.studentId   = idValue;
        this.studentName = nameValue;
    }

    void displayInfo() {
        System.out.println(studentId);
        System.out.println(studentName);
    }
}

public class Lab202 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String inputStudentId   = input.nextLine();
        String inputStudentName = input.nextLine();
        StudentLab202 student   = new StudentLab202(
            inputStudentId,
            inputStudentName
        );

        student.displayInfo();
        
        input.close();
    }
}
