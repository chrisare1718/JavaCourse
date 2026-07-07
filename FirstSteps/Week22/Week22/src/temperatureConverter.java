import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){

        Scanner temperatureConverter = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter temperature: ");
        temp = temperatureConverter.nextDouble();

        System.out.println("Convert to Celsius of Fahrenheit (C or F): ");
        unit = temperatureConverter.next().toUpperCase();

        // Condition

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f%s", newTemp, unit);

        temperatureConverter.close();

    }

}
