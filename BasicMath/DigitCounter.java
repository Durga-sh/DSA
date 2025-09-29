package BasicMath;

public class DigitCounter {
    public static int countDigits(int n){

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
