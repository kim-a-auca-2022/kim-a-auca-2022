import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("complexity level? ");
        int level = input.nextInt();
        if (level == 4 || level == 5) {
            System.out.println("You are a pro gamer.");
        } else if (level == 2 || level == 3) {
            System.out.println("You are an experienced gamer.");
        } else if (level == 1) {
            System.out.println("You are a beginner.");
        } else if (level == 0) {
            System.out.println("You are a total newbie.");
        }
    }
}
