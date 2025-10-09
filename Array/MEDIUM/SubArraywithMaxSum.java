package Array.MEDIUM;

import java.util.HashMap;
import java.util.Map;

public class SubArraywithMaxSum {

    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // stores prefixSum -> first index
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from start (0...i)
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray in between (check if sum-k was seen before)
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // store prefix sum only if it's not already stored (keep earliest index)
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String args[]) {
        LongestSubArrayWithGivenSum s = new LongestSubArrayWithGivenSum();

        int num1[] = { 10, 5, 2, 7, 1, 10 };
        System.out.println(s.longestSubarray(num1, 15)); // ✅ 4 (subarray [5,2,7,1])

        int num2[] = { 5, -2, 3, -1, 2 };
        System.out.println(s.longestSubarray(num2, 5)); // ✅ 4 (subarray [5,-2,3,-1])
    }
}
