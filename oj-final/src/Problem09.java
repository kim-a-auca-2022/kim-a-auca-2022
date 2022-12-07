import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nBirthdays = s.nextInt();
        for (int i = 0; i < nBirthdays; i++) {
            int year = s.nextInt();
            int month = s.nextInt();
            int day = s.nextInt();
            if (year < 1989) {
                System.out.println("Yes");
            } else if (year == 1989 && month < 2) {
                System.out.println("Yes");
            } else if (year == 1989 && month == 2 && day <= 27) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
