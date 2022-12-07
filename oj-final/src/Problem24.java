import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstNum = s.nextInt();
        int secondNum = s.nextInt();
        int ways = 0;
        for (int i = 1; i <= firstNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                if (i + j == 10)
                    ways++;
            }
        }
        if (ways == 1) System.out.println("There is 1 way to get the sum 10.");
        else System.out.println("There are " + ways + " ways to get the sum 10.");
    }
}

