package Lab201;

class Student {

 String name;         
 int midtermScore;    
 int finalScore;       

 Student(String name, int midtermScore, int finalScore) {
     this.name         = name;
     this.midtermScore = midtermScore;
     this.finalScore   = finalScore;
 }

 double calculateAverage() {
     return (midtermScore + finalScore) / 2.0;
 }

 void displaySummary() {
     double average = calculateAverage();   

     System.out.println("Name: " + name);
     System.out.println("Average Score: " + average);

     if (average >= 50.0) {
         System.out.println("Status: Pass");
     } else {
         System.out.println("Status: Fail");
     }
 }
}

public class Lab204 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String name      = input.nextLine();

     int midtermScore = input.nextInt();

     int finalScore   = input.nextInt();

     Student std = new Student(name, midtermScore, finalScore);

     std.displaySummary();

     input.close();
 }
}

