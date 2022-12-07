import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distanceOne = input.nextInt();
        input.nextLine();
        String direction = input.nextLine();
        int distanceTwo = input.nextInt();
        if (direction.equals("Infront")) {
            System.out.println(distanceOne - distanceTwo);
        } else {
            System.out.println(distanceOne + distanceTwo);
        }
    }
}
