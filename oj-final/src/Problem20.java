import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int win = 0;
        int i = 0;
        while (i < 6) {
            String game = s.next();
            Scanner inp = new Scanner(game);
            if (inp.hasNext("W")) {
                win++;
            }
            i++;
        }
        if (win == 5 || win == 6) {
            System.out.println(1);
        } else if (win == 3 || win == 4) {
            System.out.println(2);
        } else if (win == 2 || win == 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}


