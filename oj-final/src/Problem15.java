import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nEmployees = s.nextInt();
        double taxInt = 0;
        double pay;
        double overtime;
        for (int i = 0; i < nEmployees; i++) {
            double hourlyPay = s.nextDouble();
            double hoursWorked = s.nextDouble();
            s.nextLine();
            String taxCategory = s.nextLine();
            String donation = s.nextLine();
            if (hoursWorked > 40) {
                overtime = hoursWorked - 40;
                hoursWorked += overtime;
            }
            switch (taxCategory) {
                case "A" -> taxInt = 1;
                case "B" -> taxInt = 0.9;
                case "C" -> taxInt = 0.8;
                case "D" -> taxInt = 0.71;
                case "E" -> taxInt = 0.65;
            }

            if (donation.equals("n")) {
                pay = (hourlyPay * hoursWorked) * (taxInt);
                System.out.printf("%.2f%n", pay);
            } else {
                pay = (hourlyPay * hoursWorked) * (taxInt) - 10;
                System.out.printf("%.2f%n", pay);
            }

        }
    }
}
