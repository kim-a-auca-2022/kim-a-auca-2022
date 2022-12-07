import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        double formula = v / ((1.0 / 2) * -9.8);
        System.out.printf("%.6f%n", Math.abs(formula));
    }
}
