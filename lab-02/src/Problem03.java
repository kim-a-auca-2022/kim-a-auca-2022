import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int fourDigitInt = input.nextInt();
        int sum = 0;
        sum = sum + fourDigitInt % 10;
        fourDigitInt = fourDigitInt / 10;
        sum = sum + fourDigitInt % 10;
        fourDigitInt = fourDigitInt / 10;
        sum = sum + fourDigitInt % 10;
        fourDigitInt = fourDigitInt / 10;
        sum = sum + fourDigitInt % 10;
        System.out.println("The sum of all digits is " + sum);
    }
}
