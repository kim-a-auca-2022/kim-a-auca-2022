import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int nIntegers = 0;
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int integer = input.nextInt();
        while (integer != 0) {
            sum += integer;
            nIntegers++;

            System.out.print("Enter an integer (the input ends if it is 0): ");
            integer = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}