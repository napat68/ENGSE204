package Lab201;

class StudentLab204 {

    String studentName;      
    int midtermScore;       
    int finalScore;          

    StudentLab204(String studentName, int midtermScore, int finalScore) {
        this.studentName  = studentName;
        this.midtermScore = midtermScore;
        this.finalScore   = finalScore;
    }

    double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    void displaySummary() {

        double averageScore = calculateAverage();

        System.out.println("Name: " + studentName);
        System.out.println("Average Score: " + averageScore);

        if (averageScore >= 50.0) {
            System.out.println("Status: Pass");
        }
        else {
            System.out.println("Status: Fail");
        }
    }
}

public class Lab204 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputStudentName = input.nextLine();
        
        int inputMidtermScore = input.nextInt();
        int inputFinalScore   = input.nextInt();

        StudentLab204 student = new StudentLab204(
            inputStudentName,
            inputMidtermScore,
            inputFinalScore
        );

        student.displaySummary();
        input.close();
    }
}
