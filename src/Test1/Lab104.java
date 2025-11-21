package Test1;

import java.util.Scanner;  

public class Lab104 {

    //Method
    // Calculate grade from score
    public static char getGrade(int score) {

        if (score >= 80 && score <= 100) {
            return 'A';
        } else if (score >= 70) {     // 70–79
            return 'B';
        } else if (score >= 60) {     // 60–69
            return 'C';
        } else if (score >= 50) {     // 50–59
            return 'D';
        } else {                      // 0–49
            return 'F';
        }
    }

    //main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter score: ");
        int score = sc.nextInt();             // Get score input from user

        // Use method calculate grade
        char grade = getGrade(score);

        // Results
        System.out.println(grade);

        sc.close();
    }
}

