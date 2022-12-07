import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("some real number? ");
        double realNumber = input.nextDouble();
        double absoluteValue = realNumber;
        if (absoluteValue < 0) {
            absoluteValue = -absoluteValue;
        }
        System.out.printf("|%.2f| = %.2f%n", realNumber, absoluteValue);
    }
}
