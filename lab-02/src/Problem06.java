import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius");
        double c = input.nextDouble();
        double f = (9.0 / 5) * c + 32;
        System.out.println(c + " Celsius is " + f + " Fahrenheit");
    }
}
