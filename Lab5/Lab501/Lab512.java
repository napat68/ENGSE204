package Lab501;

import java.util.Scanner;

class ServiceLab512 {
    protected String name;
    protected double basePrice;

    public ServiceLab512(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicServiceLab512 extends ServiceLab512 {

    public BasicServiceLab512(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumServiceLab512 extends ServiceLab512 {
    protected double premiumRate;

    public PremiumServiceLab512(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Lab512 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // BasicService input
        String basicName = input.nextLine();
        double basicPrice = input.nextDouble();
        input.nextLine(); // clear newline

        // PremiumService input
        String premiumName = input.nextLine();
        double premiumPrice = input.nextDouble();
        double premiumRate = input.nextDouble();

        ServiceLab512[] services = new ServiceLab512[2];
        services[0] = new BasicServiceLab512(basicName, basicPrice);
        services[1] = new PremiumServiceLab512(premiumName, premiumPrice, premiumRate);

        for (ServiceLab512 s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        input.close();
    }
}

