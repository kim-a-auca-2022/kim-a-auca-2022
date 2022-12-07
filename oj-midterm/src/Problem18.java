import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startingCoor = input.nextInt();
        int startingCoorTwo = input.nextInt();
        int destinationCoor = input.nextInt();
        int destinationCoorTwo = input.nextInt();
        int charge = input.nextInt();
        int chargeNeeded = Math.abs(destinationCoor - startingCoor) + Math.abs(destinationCoorTwo - startingCoorTwo);
        if (charge >= chargeNeeded && (charge - chargeNeeded) % 2 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
