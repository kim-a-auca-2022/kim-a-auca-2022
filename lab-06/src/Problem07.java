import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = s.nextInt();
        System.out.println(num + (isPalindrome(num) ? " is " : " is not ") + "a palindrome.");
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        StringBuilder reverse = new StringBuilder();
        String n = num + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse.append(n.charAt(i));
        }
        return Integer.parseInt(reverse.toString());
    }
}
