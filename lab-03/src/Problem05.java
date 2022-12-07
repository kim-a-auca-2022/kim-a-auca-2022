import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of points? ");
        double points = input.nextDouble();
        if (90 <= points && points <= 100) {
            System.out.println("Grade: A");
        } else if (80 <= points && points < 90) {
            System.out.println("Grade: B");
        } else if (70 <= points && points < 80) {
            System.out.println("Grade: C");
        } else if (60 <= points && points < 70) {
            System.out.println("Grade: D");
        } else if (points < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.printf(points + " is not in the permitted range.");

        }
    }
}

