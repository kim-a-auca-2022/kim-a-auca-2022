import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        int fourthNum = input.nextInt();
        if ((firstNum == 8 || firstNum == 9) && (fourthNum == 8 || fourthNum == 9) && secondNum == thirdNum) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
