import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nAtBats = input.nextInt();
        double sum = 0;
        int z = 0;
        for (int i = 0; i < nAtBats; i++) {
            double atBats = input.nextDouble();
            if (atBats >= 0) {
                z = z + 1;
                sum += atBats;
            }
        }
        System.out.println(sum / z);
    }
}
