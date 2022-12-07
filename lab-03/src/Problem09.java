import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();
        int computer = (int) (3 * Math.random());
        String compSign = "";
        String userSign = "";
        switch (computer) {
            case 0 -> compSign = "scissors";
            case 1 -> compSign = "rock";
            case 2 -> compSign = "paper";
        }
        switch (user) {
            case 0 -> userSign = "scissors";
            case 1 -> userSign = "rock";
            case 2 -> userSign = "paper";
        }
        if (user == 0 && computer == 0) {
            System.out.printf("The computer is %s. You are %s too. It is a draw", compSign, userSign);
        } else if (computer == 0 && user == 1) {
            System.out.printf("The computer is %s. You are %s. You won", compSign, userSign);
        } else if (computer == 0 && user == 2) {
            System.out.printf("The computer is %s. You are %s. You lost", compSign, userSign);
        } else if (computer == 1 && user == 1) {
            System.out.printf("The computer is %s. You are %s too. It is a draw", compSign, userSign);
        } else if (computer == 1 && user == 0) {
            System.out.printf("The computer is %s. You are %s. You lost", compSign, userSign);
        } else if (computer == 1 && user == 2) {
            System.out.printf("The computer is %s. You are %s. You won", compSign, userSign);
        } else if (computer == 2 && user == 2) {
            System.out.printf("The computer is %s. You are %s too. It is a draw", compSign, userSign);
        } else if (computer == 2 && user == 0) {
            System.out.printf("The computer is %s. You are %s. You won", compSign, userSign);
        } else if (computer == 2 && user == 1) {
            System.out.printf("The computer is %s. You are %s. You lost", compSign, userSign);
        }
    }
}
