import java.util.Locale;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        double temperatureFahrenheit = input.nextDouble();
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5.0 / 9;
        System.out.printf("The temperature in degrees Celsius is %.2f%n", temperatureCelsius);

    }
}
