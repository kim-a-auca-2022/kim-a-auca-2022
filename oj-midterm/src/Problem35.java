import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limitSpeed = input.nextInt();
        int recordedSpeed = input.nextInt();
        int over = recordedSpeed - limitSpeed;
        if (recordedSpeed <= limitSpeed) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (over >= 1 && over <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (over >= 21 && over <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else if (over >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
