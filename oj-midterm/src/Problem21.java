import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        if (firstInt > secondInt) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
