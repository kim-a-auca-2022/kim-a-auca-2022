import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int h = input.nextInt();
        double v = 3.14159f * Math.pow(r,2) * h / 3;
        System.out.printf("%.2f\n", v);
    }
}
