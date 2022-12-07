import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        String todayString = " ";
        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = input.nextInt();
        switch (today) {
            case 0 -> todayString = "Sunday";
            case 1 -> todayString = "Monday";
            case 2 -> todayString = "Tuesday";
            case 3 -> todayString = "Wednesday";
            case 4 -> todayString = "Thursday";
            case 5 -> todayString = "Friday";
            case 6 -> todayString = "Saturday";
        }
        int dayOfTheWeek = (today + dayElapsed) % 7;
        String elapsedString = " ";
        switch (dayOfTheWeek) {
            case 0 -> elapsedString = "Sunday";
            case 1 -> elapsedString = "Monday";
            case 2 -> elapsedString = "Tuesday";
            case 3 -> elapsedString = "Wednesday";
            case 4 -> elapsedString = "Thursday";
            case 5 -> elapsedString = "Friday";
            case 6 -> elapsedString = "Saturday";
        }
        System.out.println("Today is " + todayString + " and the future day is " + elapsedString);
    }
}
