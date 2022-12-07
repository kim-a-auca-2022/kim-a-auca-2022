import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = s.nextLine();
        StringBuilder palindrome = new StringBuilder();
        int length = word.length();
        for (int i = (length - 1); i >= 0; i--) {
            palindrome.append(word.charAt(i));

        }
        if (word.equalsIgnoreCase(palindrome.toString())) {
            System.out.printf("%s is palindrome%n", word);
        } else {
            System.out.printf("%s is not a palindrome%n", word);
        }

    }
}
