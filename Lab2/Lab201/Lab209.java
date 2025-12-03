package Lab201;

class Address {

 String street;   
 String city;     
 String zipCode;  

 Address(String s, String c, String z) {
     street  = s;
     city    = c;
     zipCode = z;
 }

 String fullAddress() {
     return street + ", " + city + ", " + zipCode;
 }
}

class StudentLab209 {

 String name;
 Address addr;   

 StudentLab209(String n, Address a) {
     name = n;
     addr = a;
 }

 void displayProfile() {
     System.out.println("Name: " + name);
     System.out.println("Address: " + addr.fullAddress());
 }
}

public class Lab209 {

 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String studentName = input.nextLine();
     String streetName  = input.nextLine();
     String cityName    = input.nextLine();
     String zipInput    = input.nextLine();

     Address ad = new Address(streetName, cityName, zipInput);

     StudentLab209 stu = new StudentLab209(studentName, ad);

     stu.displayProfile();

     input.close();
 }
}

