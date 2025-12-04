package Lab201;

class Address {

    String street;
    String city;
    String zipCode;

    Address(String streetName, String cityName, String zipCodeValue) {
        this.street  = streetName;
        this.city    = cityName;
        this.zipCode = zipCodeValue;
    }

    String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}

class StudentLab209 {

    String name;
    Address address;  

    StudentLab209(String studentName, Address addressObject) {
        this.name    = studentName;
        this.address = addressObject;
    }

    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}

public class Lab209 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String studentName  = input.nextLine();
        String streetName   = input.nextLine();
        String cityName     = input.nextLine();
        String zipCodeValue = input.nextLine();

        Address studentAddress = new Address(streetName, cityName, zipCodeValue);

        StudentLab209 student  = new StudentLab209(studentName, studentAddress);

        student.displayProfile();

        input.close();
    }
}
