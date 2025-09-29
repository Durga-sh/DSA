package Recursion.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class printSubsequence {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Input array
        printSubsequences(0, arr, new ArrayList<>());
    }

    // Recursive function to print all subsequences
    static void printSubsequences(int index, int[] arr, List<Integer> current) {
        // Base case: if we've considered all elements
        if (index == arr.length) {
            System.out.println(current); // Print the current subsequence
            return;
        }

        // 1. Include current element
        current.add(arr[index]);
        printSubsequences(index + 1, arr, current);

        // 2. Exclude current element (backtrack)
        // We undo the last choice (inclusion) to explore the next choice (exclusion).
        // This is the essence of backtracking.
        current.remove(current.size() - 1);
        printSubsequences(index + 1, arr, current);
    }
}
