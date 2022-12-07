import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int l = input.nextInt();
        int tiles = input.nextInt();
        System.out.println((l / tiles) * (w / tiles));
    }
}
