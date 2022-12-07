import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double percent = s.nextDouble();
        int populationOne = s.nextInt();
        int yearOne = s.nextInt();
        int populationTwo = s.nextInt();
        int yearTwo = 0;
        int i = 0;
        int increase = 0;
        while (i < populationTwo) {
            increase = (int) (populationOne * percent);
            increase++;
            {
                yearTwo += yearOne;
                yearTwo++;
                System.out.println(yearTwo);
            }
        }
    }
}

