import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("indeterminate");
        } else if (a == 0) {
            System.out.println("undefined");
        } else {
            double x = -b / a;
            System.out.printf("%.2f%n", x);
        }

    }
}
