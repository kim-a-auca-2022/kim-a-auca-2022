import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int people = s.nextInt();
        int infectedDayZero = s.nextInt();
        int infectedDayOne = s.nextInt();
        int infectedPeople = infectedDayZero;
        int days = 0;
        while (infectedPeople <= people) {
            infectedDayZero *= infectedDayOne;
            infectedPeople += infectedDayZero;
            days++;
        }
        System.out.println(days);
    }
}