package Lab501;

import java.util.Scanner;

class ShippingLab514 {
    protected String trackingId;
    protected double baseFee;

    public ShippingLab514(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShippingLab514 extends ShippingLab514 {

    public StandardShippingLab514(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShippingLab514 extends ShippingLab514 {
    protected double insuranceFee;

    public PremiumShippingLab514(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        double base = super.calculateTotalFee(); 
        return base + insuranceFee;
    }
}

public class Lab514 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sId = input.nextLine();
        double sBaseFee = input.nextDouble();
        input.nextLine();

        String pId = input.nextLine();
        double pBaseFee = input.nextDouble();
        double insuranceFee = input.nextDouble();

        ShippingLab514[] shippings = new ShippingLab514[2];
        shippings[0] = new StandardShippingLab514(sId, sBaseFee);
        shippings[1] = new PremiumShippingLab514(pId, pBaseFee, insuranceFee);

        for (ShippingLab514 sp : shippings) {
            System.out.println(sp.calculateTotalFee());
        }

        input.close();
    }
}

