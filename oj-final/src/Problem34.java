import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nChecks = input.nextInt();
        for (int i = 0; i < nChecks; i++) {
            int number = input.nextInt();
            System.out.println(isPrimeNumber(number));
        }
    }
    static int isPrimeNumber(int nChecks) {
        int t = 0;
        int z = 0;
        for (int i = 1; i <= nChecks; i++) {
            if (nChecks % i == 0) {
                z++;
                if (z > 1) {
                    t = 1;
                } else {
                    t = 0;
                }
            }
        }
        return t;
    }
}
