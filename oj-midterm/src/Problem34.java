import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        int chicken = input.nextInt();
        int leftOver = chicken - people;
        int need = people - chicken;
        if (people < chicken && leftOver > 1) {
            System.out.printf("Dr. Chaz will have %d pieces of chicken left over!%n", leftOver);
        } else if (people < chicken && leftOver == 1) {
            System.out.printf("Dr. Chaz will have %d piece of chicken left over!%n", leftOver);
        } else if (people > chicken && need > 1) {
            System.out.printf("Dr. Chaz needs %d more pieces of chicken!%n", need);
        } else if (people > chicken && need == 1) {
            System.out.printf("Dr. Chaz needs %d more piece of chicken!%n", need);
        }
    }
}
