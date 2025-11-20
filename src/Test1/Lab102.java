package Test1;

import java.util.Scanner;

//class RectangleOOP
class Rectangle {
	
 //Attributes
 double width;   
 double height;  
 
 // Method Calculate area a rectangle
 double getArea() {
     return width * height;
 }
}

public class Lab102 {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Create object class Rectangle
     Rectangle rect = new Rectangle();

     // Receive value
     rect.width = sc.nextDouble();   // Get width
     rect.height = sc.nextDouble();  // Get height

     // Results
     System.out.println(rect.getArea());
 }
}

