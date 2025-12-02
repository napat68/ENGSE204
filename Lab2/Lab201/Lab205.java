package Lab201;

class Rectangle {

 double width;    
 double height;   

 Rectangle(double width, double height) {
     this.width  = width;
     this.height = height;
 }

 double getArea() {
     return width * height;
 }

 double getPerimeter() {
     return 2 * (width + height);
 }
}

public class Lab205 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     double width   = input.nextDouble();
     double height  = input.nextDouble();

     Rectangle rect = new Rectangle(width, height);

     System.out.println(rect.getArea());

     System.out.println(rect.getPerimeter());

     input.close();
 }
}

