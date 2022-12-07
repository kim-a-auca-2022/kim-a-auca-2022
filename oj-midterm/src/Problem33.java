import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bars = input.nextLine();
        int eye = bars.indexOf("()");
        if ((bars.length() % 2 == 0 && (bars.length() - 2) % eye == 0)) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}
