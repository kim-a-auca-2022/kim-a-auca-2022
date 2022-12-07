import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coordinateOne = input.nextInt();
        double coordinateTwo = input.nextInt();
        int zeroCoordinateTwo = 0;
        int zeroCoordinateOne = 0;
        double distance = Math.sqrt(Math.pow((coordinateOne - zeroCoordinateTwo), 2) + Math.pow((coordinateTwo - zeroCoordinateOne), 2));
        if (distance <= 10) {
            System.out.print("Point " + "(" + coordinateOne + ", " + coordinateTwo + ") " + "is in the circle");
        } else if (distance > 10)
            System.out.println("Point " + "(" + coordinateOne + ", " + coordinateTwo + ") " + "is not in the circle");
    }
}

