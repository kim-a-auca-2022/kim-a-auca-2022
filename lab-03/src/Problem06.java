import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double rootOne = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double rootTwo = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if (discriminant > 0) {
            System.out.printf("The equation has two roots %f and %f%n", rootOne, rootTwo);
        } else if (discriminant == 0) {
            System.out.printf("The equation has one root %f%n", rootOne);
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }

    }
}
