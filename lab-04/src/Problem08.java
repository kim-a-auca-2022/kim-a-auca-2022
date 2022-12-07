import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        if (weight > 0 && weight <= 2) {
            System.out.println("Cost: $2.5");
        } else if (weight > 2 && weight <= 4) {
            System.out.println("Cost: $4.5 ");
        } else if (weight > 4 && weight <= 10) {
            System.out.println("Cost: $7.5");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("Cost: $10.5");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        }

    }
}
