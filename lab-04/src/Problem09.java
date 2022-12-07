import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstEdge = input.nextInt();
        int secondEdge = input.nextInt();
        int thirdEdge = input.nextInt();
        if ((firstEdge + secondEdge) > thirdEdge && ((secondEdge + thirdEdge) > firstEdge) && ((firstEdge + thirdEdge) > secondEdge)) {
            int perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.println(perimeter);
        } else {
            System.out.println("The input is invalid");
        }
    }
}
