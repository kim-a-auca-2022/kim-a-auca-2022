import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pepperoni = input.nextInt();
        int cheese = input.nextInt();
        int vegetarian = input.nextInt();
        int total = 0;
        if (pepperoni % 3 == 0) {
            total = total + pepperoni / 3;
        } else {
            total = total + (pepperoni / 3) + 1;
        }
        if (cheese % 3 == 0) {
            total = total + cheese / 3;
        } else {
            total = total + (cheese / 3) + 1;
        }
        if (vegetarian % 3 == 0) {
            total = total + vegetarian / 3;
        } else {
            total = total + (vegetarian / 3) + 1;
        }
        System.out.println(total);

    }
}
