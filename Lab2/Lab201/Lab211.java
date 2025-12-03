package Lab201;

class Car {

 private String model;  
 private int year;    

 Car(String model, int year) {
     this.model = model;
     this.year = year;
 }

 public String getModel() {
     return model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int newYear) {
     year = newYear;
 }
}

public class Lab211 {
 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String model = input.nextLine(); 
     int oldYear  = input.nextInt();   
     int newYear  = input.nextInt();  

     Car myCar = new Car(model, oldYear);

     myCar.setYear(newYear);

     System.out.println("Model: " + myCar.getModel());
     System.out.println("Year: " + myCar.getYear());

     input.close();
 }
}

