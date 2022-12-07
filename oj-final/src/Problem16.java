import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nCases = s.nextInt();
        for (int i = 0; i < nCases; i++) {
            int degrees = s.nextInt();
            if (degrees <= 45 || degrees >= 315) {
                System.out.println("N");
            } else if (degrees <= 135) {
                System.out.println("E");
            } else if (degrees <= 225) {
                System.out.println("S");
            } else {
                System.out.println("W");
            }

        }
    }
}
