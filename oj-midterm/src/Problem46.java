import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gold = input.nextInt();
        int silver = input.nextInt();
        int copper = input.nextInt();
        int formula = (gold * 3) + silver * 2 + copper;
        String victoryCard = "";
        String treasureCard = "";
        if (formula >= 8) {
            victoryCard = "Province";
        } else if (formula >= 5) {
            victoryCard = "Duchy";
        } else if (formula >= 2) {
            victoryCard = "Estate";
        }
        if (formula >= 6) {
            treasureCard = "Gold";
        } else if (formula >= 3) {
            treasureCard = "Silver";
        } else {
            treasureCard = "Copper";
        }
        if (victoryCard.equals("")) {
            System.out.println(treasureCard);
        } else {
            System.out.println(victoryCard + " or " + treasureCard);
        }

    }
}
