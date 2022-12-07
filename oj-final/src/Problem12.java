import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nPlayers = s.nextInt();
        int starPlayers = 0;
        for (int i = 0; i < nPlayers; i++) {
            int nPoints = s.nextInt();
            int nFouls = s.nextInt();
            if (5 * nPoints - 3 * nFouls > 40)
                starPlayers++;
        }
        if (starPlayers == nPlayers) {
            System.out.println(starPlayers + "+");
        } else {
            System.out.println(starPlayers);
        }
    }
}

