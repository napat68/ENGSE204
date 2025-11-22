package Test1;

import java.util.Scanner;  

public class Lab104 {

    public static char getGrade(int points) {

        if (points >= 80 && points <= 100) {
            return 'A';
        } else if (points >= 70) {     
            return 'B';
        } else if (points >= 60) {     
            return 'C';
        } else if (points >= 50) {     
            return 'D';
        } else {                      
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);  

        System.out.print("Please enter points: ");
        int points = Number.nextInt();            

        char grade = getGrade(points);

        System.out.println(grade);

        Number.close();
    }
}

