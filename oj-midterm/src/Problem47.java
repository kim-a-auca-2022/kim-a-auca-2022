import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int xTwo = input.nextInt();
        int yTwo = input.nextInt();
        int xThree = input.nextInt();
        int yThree = input.nextInt();
        int xFour = 0;
        int yFour = 0;
        if (x == xTwo) {
            xFour = xThree;
        } else if (x == xThree) {
            xFour = xTwo;
        } else if (xTwo == xThree) {
            xFour = x;
        }
        if (y == yTwo) {
            yFour = yThree;
        } else if (y == yThree) {
            yFour = yTwo;
        } else if (yTwo == yThree) {
            yFour = y;
        }
        System.out.println(xFour + " " + yFour);
    }
}