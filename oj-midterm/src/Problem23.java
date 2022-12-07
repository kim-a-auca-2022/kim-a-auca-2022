import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int minutesBefore = minutes - 45;
        if (hours == 0 && minutes < 45) {
            hours = 23;
            minutes = 60 + minutesBefore;
            System.out.println(hours + " " + minutes);
        } else if (minutesBefore < 0) {
            hours = hours - 1;
            minutes = 60 + minutesBefore;
            System.out.println(hours + " " + minutes);
        } else if (minutes >= 45) {
            minutes = minutes - 45;
            System.out.println(hours + " " + minutes);
        }
    }
}
