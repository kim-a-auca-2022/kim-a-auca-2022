import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int min = input.nextInt();
        int years = min / 60 / 24 / 365;
        int days = min % (60 * 24 * 365) / (60 * 24);
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
