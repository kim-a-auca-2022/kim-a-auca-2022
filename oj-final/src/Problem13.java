import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nBids = s.nextInt();
        String winner;
        int winnerBid = 0;
        for (int i = 0; i < nBids; i++) {
            String name = s.nextLine();
            s.next();
            int amountOfBid = s.nextInt();
            if (amountOfBid>winnerBid) {
                winner = name;
                winnerBid = amountOfBid;
                System.out.println(winner);
            }
        }
    }
}
