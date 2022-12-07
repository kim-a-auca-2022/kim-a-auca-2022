import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int x = 0;
        int i = 0;
        while (i < Math.pow(num, x)) {
            x++;
        }   System.out.println(x);
    }
}
