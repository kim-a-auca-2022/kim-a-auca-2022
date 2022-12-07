import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int angle = input.nextInt();
        System.out.println((int) (height / Math.sin(angle * Math.PI / 180) + 1));
    }
}
