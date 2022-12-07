import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nCases = s.nextInt();
        int nCandles;
        for (int i = 0; i < nCases; i++) {
            int numOne = s.nextInt();
            int numTwo = s.nextInt();
            nCandles = numTwo + (numTwo * (numTwo + 1)) / 2;
            System.out.printf("%d %d%n", numOne, nCandles);
        }
    }
}
