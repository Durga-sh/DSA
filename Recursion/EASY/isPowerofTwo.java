package Recursion.EASY;

public class isPowerofTwo {
    public  static boolean isPowerOf(int n) {
        // Recursive Approach
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOf(n / 2);
    }

    public static void main(String[] args) {

        int[] testCases = {1, 2, 3, 4, 8, 16, 18, 32, 64, 100};

        System.out.println("Check if numbers are power of two:");
        for (int n : testCases) {
            System.out.println("Is " + n + " a power of two? -> " +isPowerOf(n));
        }
    }
}
