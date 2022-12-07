
import java.util.Random;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        int[] counters = new int[11];

        System.out.print("N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int diceOne = (1 + rnd.nextInt(6));
            int diceTwo = (1 + rnd.nextInt(6));
            ++counters[diceOne + diceTwo - 2];
        }
        for (int i = 0; i < counters.length; i++) {
            System.out.printf("%d: %d%n", i + 2, counters[i]);
        }
    }
}
