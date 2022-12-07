import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int lottery = (int) (Math.random() * 1000);
        int userDigitOne = user / 100;
        int userDigitTwo = (user % 100) / 10;
        int userDigitThree = user % 10;
        int lotteryDigitOne = lottery / 100;
        int lotteryDigitTwo = (lottery % 100) / 10;
        int lotteryDigitThree = lottery % 10;
        System.out.println("The lottery number is " + lottery);
        if (user == lottery) {
            System.out.println("All digits match in the exact order. The award is $10.000");
        } else if ((userDigitOne == lotteryDigitOne && userDigitTwo == lotteryDigitThree && userDigitThree == lotteryDigitTwo) || (userDigitOne == lotteryDigitTwo && userDigitTwo == lotteryDigitOne && userDigitThree == lotteryDigitThree) || (userDigitOne == lotteryDigitTwo && userDigitTwo == lotteryDigitThree && userDigitThree == lotteryDigitOne) || (userDigitOne == lotteryDigitThree && userDigitTwo == lotteryDigitOne && userDigitThree == lotteryDigitTwo) || (userDigitOne == lotteryDigitThree && userDigitTwo == lotteryDigitTwo && userDigitThree == lotteryDigitOne)) {
            System.out.println("All digits match. The award is $3.000");
        } else if (userDigitOne == lotteryDigitOne || userDigitTwo == lotteryDigitTwo || userDigitThree == lotteryDigitThree || userDigitOne == lotteryDigitTwo || userDigitOne == lotteryDigitThree || userDigitTwo == lotteryDigitOne || userDigitTwo == lotteryDigitThree || userDigitThree == lotteryDigitOne || userDigitThree == lotteryDigitTwo) {
            System.out.println("One digit matches. The award is $1.000");
        } else {
            System.out.println("You lost. Try again");
        }

    }
}
