import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        String output = ((c >= a && c < b) || (c < a && b < d) || (d < b && d > a)) ? "YES" : "NO";
        System.out.println(output);
    }
}

