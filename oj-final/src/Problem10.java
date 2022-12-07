import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int amount = s.nextInt();
        int t = 0;
        for (int i = 0; i < amount; i++) {
            t = (int) (Math.pow(10, i + 1) * num) + t;
        }
        System.out.println(t + num);
    }
}
