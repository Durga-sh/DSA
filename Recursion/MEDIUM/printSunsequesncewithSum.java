package Recursion.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class printSunsequesncewithSum {
     public static void main(String[] args) {
         int[] arr = { 1, 2, 1}; // Input array
         int k = 2;
        printSubsequences(0, arr, new ArrayList<>(),0 ,  k );
    }

    // Recursive function to print all subsequences
    static void printSubsequences(int index, int[] arr, List<Integer> current ,int currentSum ,int target ) {
        // Base case: if we've considered all elements
        if (index == arr.length) {
            if(currentSum== target)
            System.out.println(current); 
            return;
        }

        // 1. Include current element
        current.add(arr[index]);
        currentSum += arr[index];
        printSubsequences(index + 1, arr, current , currentSum , target);

        // 2. Exclude current element (backtrack)
        // We undo the last choice (inclusion) to explore the next choice (exclusion).
        // This is the essence of backtracking.
        current.remove(current.size() - 1);
        currentSum -= arr[index];
        printSubsequences(index + 1, arr, current , currentSum , target);
    }
}
