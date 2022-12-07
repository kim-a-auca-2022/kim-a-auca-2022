public class Problem10 {
    public static void main(String[] args) {

        final int numberOfPrimes = 50;
        final int numberOfPrimesPerLine = 10;

        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < numberOfPrimes) {
            boolean prime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;

                if (count % numberOfPrimesPerLine == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}