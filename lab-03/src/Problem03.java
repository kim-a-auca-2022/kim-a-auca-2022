import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1st number? ");
        int realNumberOne = input.nextInt();
        System.out.print("2nd number? ");
        int realNumberTwo = input.nextInt();
        System.out.print("3rd number? ");
        int realNumberThree = input.nextInt();
        System.out.printf("The value %d is the greatest one%n", Math.max(realNumberOne, Math.max(realNumberTwo, realNumberThree)));
    }
}