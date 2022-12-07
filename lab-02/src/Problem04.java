import java.util.Locale;
import java.util.Scanner;

public class Problem04 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double inches = input.nextDouble();
        double cm = CM_PER_INCH * inches;
        System.out.printf("%.2f in. = %.2f cm.%n", inches, cm);


    }
}
