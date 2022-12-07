import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int mod = (Math.min(n, (m - 1)));
        System.out.println(mod);

    }
}
