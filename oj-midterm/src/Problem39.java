import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fingers = input.nextInt();
        switch (fingers) {
            case 1, 9, 10 -> System.out.println("1");
            case 2, 3, 7, 8 -> System.out.println("2");
            case 4, 5, 6 -> System.out.println("3");
        }
    }
}
