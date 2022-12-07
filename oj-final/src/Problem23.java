import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nLines = s.nextInt();
        for (int i = 0; i < nLines; i++) {
            int num = s.nextInt();
            String character = s.next();
            for (int j = 0; j < num; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}


