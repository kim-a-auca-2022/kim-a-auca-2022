import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coordinateOne = input.nextDouble();
        double coordinateTwo = input.nextDouble();
        int zeroCoordinateOne = 0;
        int zeroCoordinateTwo = 0;
        double horizontalDistance = Math.sqrt(Math.pow((coordinateOne - zeroCoordinateTwo), 2));
        double verticalDistance = Math.sqrt(Math.pow((coordinateTwo - zeroCoordinateOne), 2));
        if (horizontalDistance <= (10.0 / 2) && verticalDistance <= 5.0 / 2) {
            System.out.println("Point (" + coordinateOne + ",  " + coordinateTwo + ") is in the rectangle");
        } else
            System.out.println("Point (" + coordinateOne + ",  " + coordinateTwo + ") is not in the rectangle");

    }
}
