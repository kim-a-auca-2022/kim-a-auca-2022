import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digitOne = input.nextInt();
        int digitTwo = input.nextInt();
        int t = digitOne;
        digitOne = digitTwo;
        digitTwo = t;
        System.out.println(digitOne + " " + digitTwo + " ");
    }
}
