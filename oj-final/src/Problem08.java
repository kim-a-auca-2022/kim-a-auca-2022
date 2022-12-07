import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int thisYear = s.nextInt();
        int futureYear = s.nextInt();
        System.out.println("All positions change in year " + thisYear);
        for (int i = thisYear + 1; i <= futureYear; i++) {
            int changes = i - thisYear;
            if (changes % 4 == 0 && changes % 3 == 0 && changes % 2 == 0 && changes % 5 == 0) {
                System.out.println("All positions change in year " + i);
            }
        }
    }

}