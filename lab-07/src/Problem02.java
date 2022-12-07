import java.util.Scanner;

public class Problem02 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int year = readInt("Year: ", "Incorrect year", 1, 100000);
            int month = readInt("Month: ", "Incorrect month", 1, 12);
            System.out.println("Number of days: " + getNumberOfDays(year, month));
        }
    }

    static int getNumberOfDays(int year, int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = days[month - 1];
        if (month == 2 && isLeap(year)) {
            res++;
        }
        return res;
    }

    static int readInt(String prompt, String errorMessage, int minValue, int maxValue) {
        System.out.print(prompt);
        if (!s.hasNextInt()) {
            System.exit(1);
        }
        int res = s.nextInt();
        if (res < minValue || maxValue < res) {
            System.out.println(errorMessage);
            System.exit(1);

        }
        return res;
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}
