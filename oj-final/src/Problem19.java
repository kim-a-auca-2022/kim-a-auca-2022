import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int m = s.nextInt();
        int n = 0;
        while (true) {
            if (n >= m) {
                System.out.println("No such integer exists.");
                break;
            } else if (x * n % m == 1) {
                System.out.println(n);
                break;
            }
            n++;
        }

    }
}
