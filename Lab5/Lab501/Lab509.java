package Lab501;

import java.util.Scanner;

class ItemLab509 {
    protected String name;

    public ItemLab509(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProductLab509 extends ItemLab509 {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProductLab509(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscriptionLab509 extends ItemLab509 {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscriptionLab509(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Lab509 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String physicalName = input.nextLine();
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        input.nextLine(); 

        String digitalName = input.nextLine();
        double monthlyCost = input.nextDouble();
        int months = input.nextInt();

        ItemLab509[] items = new ItemLab509[2];
        items[0] = new PhysicalProductLab509(physicalName, unitPrice, quantity);
        items[1] = new DigitalSubscriptionLab509(digitalName, monthlyCost, months);

        double totalValue = 0.0;

        for (ItemLab509 item : items) {
            totalValue += item.getValue();
        }

        System.out.println(totalValue);

        input.close();
    }
}
