package Array.MEDIUM;

public class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(int arr[], int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);
        
        reverse(arr, k, n-1);
     
    }

    // Helper method to reverse a portion of the array
    public void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;

        System.out.println("Original array:");
        printArray(arr);

        sol.reverseInGroups(arr, k);

        System.out.println("\nArray after reversing in groups of " + k + ":");
        printArray(arr);
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
