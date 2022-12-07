import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallTreats = input.nextInt();
        int mediumTreats = input.nextInt();
        int largeTreats = input.nextInt();
        int happinessScoreFormula = 1 * smallTreats + 2 * mediumTreats + 3 * largeTreats;
        if (happinessScoreFormula >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
