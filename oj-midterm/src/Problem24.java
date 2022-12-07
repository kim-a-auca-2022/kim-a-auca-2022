import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        if (firstNumber > secondNumber) {
            System.out.printf(secondNumber + " " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.printf(firstNumber + " " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
        }
    }
}
