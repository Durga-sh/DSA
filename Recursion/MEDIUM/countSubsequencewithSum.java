package Recursion.MEDIUM;

public class countSubsequencewithSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2 }; // Input array
        int k = 4;
        int count = printSubsequences(0, arr, 0, k);
        System.out.println(count);
    }

    // Recursive function to print all subsequences
    static int printSubsequences(int index, int[] arr, int currentSum, int target) {
        // Base case: if we've considered all elements
        if (index == arr.length) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        currentSum += arr[index];
        int l = printSubsequences(index + 1, arr, currentSum, target);

        currentSum -= arr[index];
        int r = printSubsequences(index + 1, arr, currentSum, target);
        return l + r;
    }
}
