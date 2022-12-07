import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weightOfBowlOne = input.nextInt();
        int weightOfBowlTwo = input.nextInt();
        int weightOfBowlThree = input.nextInt();
        if ((weightOfBowlOne > weightOfBowlTwo && weightOfBowlTwo > weightOfBowlThree) || (weightOfBowlThree > weightOfBowlTwo && weightOfBowlTwo > weightOfBowlOne)) {
            System.out.println(weightOfBowlTwo);
        } else if ((weightOfBowlThree > weightOfBowlOne && weightOfBowlOne > weightOfBowlTwo) || (weightOfBowlTwo > weightOfBowlOne && weightOfBowlOne > weightOfBowlThree)) {
            System.out.println(weightOfBowlOne);
        } else if ((weightOfBowlOne > weightOfBowlThree && weightOfBowlThree > weightOfBowlTwo) || (weightOfBowlTwo > weightOfBowlThree && weightOfBowlThree > weightOfBowlOne)) {
            System.out.println(weightOfBowlThree);
        }
    }
}
