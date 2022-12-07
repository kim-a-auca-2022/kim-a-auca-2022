import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Number of tests? ");
        int nTests = input.nextInt();
        int nCorrectAnswers = 0;
        for (int i = 0; i < nTests; i++) {
            int opOne = -50 + rnd.nextInt(101);
            int opTwo = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = ", opOne, opTwo);
            int ans = input.nextInt();
            if (ans == opOne + opTwo) {
                ++nCorrectAnswers;
            }

        }
        System.out.println("Number of correct answers: " + nCorrectAnswers);
        System.out.println("Number of incorrect answers: " + (nTests - nCorrectAnswers));


    }
}
