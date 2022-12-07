import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nCases = s.nextInt();
        for (int i = 0; i < nCases; i++) {
            int num = s.nextInt();
            int length = String.valueOf(num).length();
            if (num == -num) {
                Math.abs(num);
            }
             while (i<num) {
                 length++;
                 System.out.println(length);
             }
        }
    }
}
