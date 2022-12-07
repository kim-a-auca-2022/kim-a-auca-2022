import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rounds = s.nextInt();
        int antonia = 0;
        int david = 0;
        for (int i = 0; i < rounds; i++) {
            int antoniaS = s.nextInt();
            int davidS = s.nextInt();
            if (antoniaS > davidS) {
                antonia += antoniaS;
            } else if (antoniaS < davidS) {
                david += davidS;
            }
        }
        System.out.println(100-david);
        System.out.println(100-antonia);
    }
}
