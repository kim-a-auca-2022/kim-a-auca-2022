public class Problem08 {
    public static void main(String[] args) {
        System.out.println("   Multiplication Table");
        System.out.print("   ");
        for (int i = 1; i<=9; i++){
            System.out.print("    "+ i);
        }
        System.out.printf("%n-------------------------------------------------%n");
        for (int j = 1; j <= 9; j++){
            System.out.print(j + " | ");
            for (int k = 1; k<=9; k++) {
                System.out.printf("%4d ", k * j);
            }
            System.out.println();
        }
    }
}