package Lab301;
import java.util.Scanner;

class UserLab303{

 private String password;

 public UserLab303(String initialPassword) {
     this.password = initialPassword;
 }

 public String getPassword() {
     return this.password;
 }

 public void setPassword(String newPassword) {
     if (newPassword.length() >= 8) {
         this.password = newPassword;
         System.out.println("Password updated.");
     } else {
         System.out.println("Password is too short.");
     }
 }
}

public class Lab303 {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     String initialPassword = input.nextLine(); 
     String newPassword     = input.nextLine();

     UserLab303 U1 = new UserLab303(initialPassword); 
     U1.setPassword(newPassword);       

     System.out.println(U1.getPassword());

     input.close();
 }
}

