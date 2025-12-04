package Lab201;

class TempConverter {

    public static double toFahrenheit(double celsiusValue) {
        return (celsiusValue * 9.0 / 5.0) + 32.0;
    }

    public static double toCelsius(double fahrenheitValue) {
        return (fahrenheitValue - 32.0) * 5.0 / 9.0;
    }
}

public class Lab208 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        String modeInput = input.nextLine();

        double temperatureValue = input.nextDouble();

        double resultValue;

        if ("C_TO_F".equals(modeInput)) {
            resultValue = TempConverter.toFahrenheit(temperatureValue);
        } 
        else {
            resultValue = TempConverter.toCelsius(temperatureValue);
        }

        System.out.println(resultValue);

        input.close();
    }
}
