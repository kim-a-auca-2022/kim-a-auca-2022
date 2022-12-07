import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int telephoneNumber = input.nextInt();
        if (telephoneNumber / 10000 == 555) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
