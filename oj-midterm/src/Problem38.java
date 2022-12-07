import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        if (bmi > 25.0) {
            System.out.println("Overweight");
        } else if (18.5 <= bmi) {
            System.out.println("Normal weight");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        }
    }
}
