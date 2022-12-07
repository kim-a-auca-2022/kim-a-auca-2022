import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int y = input.nextInt();
        double p = 312032486.0;
        double sec = 31536000.0;
        int q = (int) (Math.ceil(p+y*sec/7.0+y*sec/45.0)-y*sec/13.0);
        System.out.println("The population in " + y + " years is " + q + " ");
    }
}
