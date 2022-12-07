import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nTiles = s.nextInt();
        int i = 0;
        int length = 0;
        while (i<nTiles) {
            length = (int) Math.sqrt(nTiles);
            i++;
        }  System.out.printf("The largest square has side length %d.%n", length);
    }
}
