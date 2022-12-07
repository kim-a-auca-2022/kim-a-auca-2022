import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int applesOne = input.nextInt();
        int applesTwo = input.nextInt();
        int applesThree = input.nextInt();
        int bananasOne = input.nextInt();
        int bananasTwo = input.nextInt();
        int bananasThree = input.nextInt();
        int applesScore = (applesOne * 3) + (applesTwo * 2) + applesThree;
        int bananasScore = (bananasOne * 3) + (bananasTwo * 2) + bananasThree;
        if (applesScore > bananasScore) {
            System.out.println("A");
        } else if (bananasScore > applesScore) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
