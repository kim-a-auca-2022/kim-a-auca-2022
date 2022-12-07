import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = s.nextLong();
        System.out.println("The sum of digits is: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
        int temp = (int) Math.abs(n);
        int sum = 0;
        while (temp != 0) {
            sum += (temp % 10);
            temp = temp / 10;
        }
        return sum;
    }

}

