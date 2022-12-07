import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        if (firstInt % secondInt == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
