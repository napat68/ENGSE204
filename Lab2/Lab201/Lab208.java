package Lab201;

class TempConverter {

 public static double toF(double c) {
     return (c * 9.0 / 5.0) + 32.0;
 }

 public static double toC(double f) {
     return (f - 32.0) * 5.0 / 9.0;
 }
}

public class Lab208 {

 public static void main(String[] args) {

     java.util.Scanner input = new java.util.Scanner(System.in);

     String modeInput = input.nextLine();      
     double tempValue = input.nextDouble();    

     double output;

     if ("C_TO_F".equals(modeInput)) {
         output = TempConverter.toF(tempValue);
     } else {
         output = TempConverter.toC(tempValue);
     }

     System.out.println(output);

     input.close();
 }
}
