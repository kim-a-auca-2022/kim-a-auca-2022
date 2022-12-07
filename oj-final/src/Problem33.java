import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nCases = s.nextInt();
        for (int i = 0; i < nCases; i++) {
            int year = s.nextInt();
            int month = s.nextInt();
            int day = s.nextInt();
            System.out.println(getNumberOfDays(day));
        }

    }

    static boolean isLeap(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    static int getNumberOfDays(int year) {
        int days = 0;
        int month;
//        switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
//            case 4, 6, 9, 11 -> days = 30;
//        }
//        return days;


        return days;
    }
}
