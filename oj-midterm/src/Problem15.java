import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        int q = input.nextInt();
        int l = input.nextInt();
        int t = input.nextInt();
        int salary = (n*5)+(d*10)+(q*25)+(l*100)+(t*200);
        System.out.println(salary);
    }
}
