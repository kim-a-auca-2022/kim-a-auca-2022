public class Problem01 {
    public static void main(String[] args) {
        double d = 0.1;
        double sum = 0;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        sum += d;
        if (Math.abs(sum - 1) <= 0.00000001) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
            System.out.println(sum);
        }
    }
}
