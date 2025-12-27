package Lab501;

import java.util.Scanner;

class RentalVehicleLab515 {
    protected String model;
    protected double rentalRate;

    public RentalVehicleLab515(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class CarLab515 extends RentalVehicleLab515 {

    public CarLab515(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0; 
    }
}

class MotorcycleLab515 extends RentalVehicleLab515 {

    public MotorcycleLab515(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab515 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String carModel = input.nextLine();
        double carRate = input.nextDouble();
        input.nextLine(); 

        String bikeModel = input.nextLine();
        double bikeRate = input.nextDouble();

        RentalVehicleLab515 car = new CarLab515(carModel, carRate);
        RentalVehicleLab515 bike = new MotorcycleLab515(bikeModel, bikeRate);

        RentalVehicleLab515[] vehicles = { car, bike };

        double total = 0.0;
        for (RentalVehicleLab515 v : vehicles) {
            total += v.calculateFee();
        }

        System.out.println(total);

        input.close();
    }
}
