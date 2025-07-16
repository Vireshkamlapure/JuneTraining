package prime;

public class Temp {
    public static void main(String[] args) {
        int num = 2;
        int totalPrimesSeen = 0;
        int printedCount = 0;

        while (printedCount < 50) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                totalPrimesSeen++;
                if (totalPrimesSeen % 2 != 0) {
                    System.out.println(num + " is prime, count " + printedCount);
                    printedCount++;
                }
            }
            num++;
        }
    }
}
