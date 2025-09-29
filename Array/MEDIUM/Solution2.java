package Array.MEDIUM;

class Solution2 {

    // Main function to count number of subarrays with exactly k odd numbers
    public int numberOfSubarrays(int[] nums, int k) {
        // Using atMost approach: exactly k = atMost(k) - atMost(k-1)
        return numberOfSubArraysAtMostK(nums, k) - numberOfSubArraysAtMostK(nums, k - 1);
    }

    // Helper function: counts number of subarrays with at most k odd numbers
    private int numberOfSubArraysAtMostK(int[] nums, int k) {
        if (k < 0)
            return 0; // no valid subarray

        int l = 0, r = 0, count = 0, oddCount = 0;

        while (r < nums.length) {
            // Include nums[r] in the window
            if (nums[r] % 2 != 0) {
                oddCount++;
            }

            // Shrink the window from the left while oddCount > k
            if (oddCount > k) {
                if (nums[l] % 2 != 0) {
                    oddCount--;
                }
                l++;
            }

            // while (oddCount > k) {
            // if (nums[l] % 2 != 0) {
            // oddCount--;
            // }
            // l++;
            // }

            // Add number of subarrays ending at r
            if (oddCount <= k) {
                count += r - l + 1;
            }
            // count += r - l + 1;

            r++;
        }

        return count;
    }

    // Test case
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        // int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        // int[] nums = { 1, 1, 1, 1 };
        int[] nums = { 1, 3, 5, 7, 2 };
        int k = 1;
        System.out.println(sol.numberOfSubarrays(nums, k)); // Output: 9
    }
}
