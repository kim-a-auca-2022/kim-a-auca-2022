import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int daytimeMin = input.nextInt();
        int eveningMin = input.nextInt();
        int weekendMin = input.nextInt();
        double planA = 0.0;
        double planB = 0.0;
        if (daytimeMin > 100) {
            planA = ((daytimeMin - 100.0) * 0.25) + (eveningMin * 0.15) + (weekendMin * 0.20);
            planA = Math.round(planA * 100.0) / 100.0;
        } else {
            planA = (eveningMin * 0.15) + (weekendMin * 0.2);
            planA = Math.round(planA * 100.0) / 100.0;
        }
        if (daytimeMin > 250) {
            planB = ((daytimeMin - 250.0) * 0.45) + (eveningMin * 0.35) + (weekendMin * 0.25);
            planB = Math.round(planB * 100.0) / 100.0;

        } else {
            planB = (eveningMin * 0.35) + (weekendMin * 0.25);
            planB = Math.round(planB * 100.0) / 100.0;

        }
        System.out.printf("Plan A costs %.2f%n", planA);
        System.out.printf("Plan B costs %.2f%n", planB);
        if (planA > planB) {
            System.out.println("Plan B is cheapest.");
        } else if (planA == planB) {
            System.out.println("Plan A and B are the same price.");
        } else {
            System.out.println("Plan A is cheapest.");
        }
    }
}
