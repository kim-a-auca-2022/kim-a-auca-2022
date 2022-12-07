import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1st value? ");
        int firstValue = input.nextInt();
        System.out.print("2nd value? ");
        int secondValue = input.nextInt();
        System.out.printf("Before swapping: a=%d; b=%d;%n", firstValue, secondValue);
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;
        System.out.printf("After swapping: a=%d; b=%d;%n", firstValue, secondValue);


    }
}
