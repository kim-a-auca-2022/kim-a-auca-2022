import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        if (firstNum > secondNum && secondNum > thirdNum) {
            System.out.println(thirdNum + " " + secondNum + " " + firstNum + " ");
        } else if (secondNum > thirdNum && thirdNum > firstNum) {
            System.out.println(firstNum + " " + thirdNum + " " + secondNum + " ");
        } else if (thirdNum > secondNum && secondNum > firstNum) {
            System.out.println(firstNum + " " + secondNum + " " + thirdNum + " ");
        } else if (secondNum > firstNum && firstNum > thirdNum) {
            System.out.println(thirdNum + " " + firstNum + " " + secondNum + " ");
        } else if (firstNum > thirdNum && thirdNum > secondNum) {
            System.out.println(secondNum + " " + thirdNum + " " + firstNum + " ");
        } else if (thirdNum > firstNum && firstNum > secondNum) {
            System.out.println(secondNum + " " + firstNum + " " + thirdNum + " ");
        }
    }
}
