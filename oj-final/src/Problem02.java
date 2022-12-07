import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String words;
        for (int i = 0; i < n; i++) {
            String word = input.next();
            if (i % 2 == 0){
                words = word;
                System.out.println(words);
            }
        }
    }
}
