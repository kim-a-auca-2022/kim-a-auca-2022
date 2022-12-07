import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int xTwo = input.nextInt();
        int yTwo = input.nextInt();
        int xS = input.nextInt();
        int yS = input.nextInt();
        int d = input.nextInt();
        double distance = Math.sqrt(Math.pow((x - xS), 2) + (Math.pow((y - yS), 2)));
        double distanceTwo = Math.sqrt(Math.pow((xTwo - xS), 2) + (Math.pow((yTwo - yS), 2)));
        if (distance <= d || distanceTwo <= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
