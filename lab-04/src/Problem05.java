import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Year? ");
        int year = input.nextInt();
        System.out.print("Month? ");
        int month = input.nextInt();
        if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Number of days: 29");
        } else if (month == 2 && (year % 400 != 0 || (year % 4 != 0 && year % 100 == 0))) {
            System.out.println("Number of days: 28");
        }
        if (month == 1) {
            System.out.println("Number of days: 31");
        } else if (month == 3) {
            System.out.println("Number of days: 31");
        } else if (month == 4) {
            System.out.println("Number of days: 30");
        } else if (month == 5) {
            System.out.println("Number of days: 31");
        } else if (month == 6) {
            System.out.println("Number of days: 30");
        } else if (month == 7) {
            System.out.println("Number of days: 31");
        } else if (month == 8) {
            System.out.println("Number of days: 31");
        } else if (month == 9) {
            System.out.println("Number of days: 30");
        } else if (month == 10) {
            System.out.println("Number of days: 31");
        } else if (month == 11) {
            System.out.println("Number of days: 30");
        } else if (month == 12) {
            System.out.println("Number of days: 31");
        }
    }
}
