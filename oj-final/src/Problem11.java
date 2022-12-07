import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lines = s.nextInt();
        double line1 = 0;
        double line2;
        for (int i = 0; i < lines/2; i++) {
            line1 = s.nextDouble();
        }
        for (int j = 0; j < lines/2; j++) {
            line2 = s.nextDouble();
            if (line2 - line1 > 0) {
                System.out.printf("%.2f", line1);
            } else {
                System.out.printf("%.2f", line2);
            }
        }
    }
}
