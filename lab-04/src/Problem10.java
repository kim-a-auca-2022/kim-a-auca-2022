public class Problem10 {
    public static void main(String[] args) {
        int cardRank = (int) ((Math.random() * (14 + 1)) - 1);
        int cardSuit = (int) (Math.random() * 4);
        System.out.print("The card you picked is ");
        switch (cardRank) {
            case 1 -> System.out.print("Ace");
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> System.out.print(cardRank);
            case 11 -> System.out.print("Jack");
            case 12 -> System.out.print("Queen");
            case 13 -> System.out.print("King");
        }
        System.out.print(" of ");
        switch (cardSuit) {
            case 0 -> System.out.print("Clubs");
            case 1 -> System.out.print("Diamonds");
            case 2 -> System.out.print("Hearts");
            case 3 -> System.out.print("Spades");
        }


    }
}

