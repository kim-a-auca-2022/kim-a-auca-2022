import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int userX = s.nextInt();
        System.out.print("Coordinate of 1st point: ");
        int xOne = s.nextInt();
        System.out.print("Coordinate of 2nd point: ");
        int xTwo = s.nextInt();
        int dOne = myAbs(xOne - userX);
        int dTwo = myAbs(xTwo - userX);
        if (dOne < dTwo) {
            System.out.println("1st point is closer. Distance " + dOne);
        } else if (dTwo < dOne) {
            System.out.println("2nd point is closer. Distance " + dTwo);
        } else {
            System.out.println("Distance is the same " + dOne);
        }
    }

    static int myAbs(int n) {
        if (n < 0) {
            n = -n;


        }
        return n;
    }
}
