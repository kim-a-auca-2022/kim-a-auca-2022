import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstAngle = input.nextInt();
        int secondAngle = input.nextInt();
        int thirdAngle = input.nextInt();
        if (firstAngle == 60 && secondAngle == 60 && thirdAngle == 60) {
            System.out.println("Equilateral");
        } else if (firstAngle + secondAngle + thirdAngle == 180 && firstAngle == secondAngle || secondAngle == thirdAngle || firstAngle == thirdAngle) {
            System.out.println("Isosceles");
        } else if (firstAngle + secondAngle + thirdAngle == 180) {
            System.out.println("Scalene");
        } else if (firstAngle + secondAngle + thirdAngle != 180) {
            System.out.println("Error");
        }
    }
}
