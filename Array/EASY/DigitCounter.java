package Array.EASY;

public class DigitCounter {
    public static int countDigits(int n) {
        // Special case for 0
        if (n == 0) {
            return 1;
        }
        // Make n positive if it's negative
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12345; // Example input
        System.out.println("Number of digits in " + n + " is: " + countDigits(n));
    }
}
