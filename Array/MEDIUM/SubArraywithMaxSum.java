package Array.MEDIUM;
import java.util.Arrays;

public class SubArraywithMaxSum {

    // Variables to track subarray indices
    private int start = 0;
    private int end = 0;

    public int maxSubArray(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int tempStart = 0;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
              tempStart = i;  
            }
            sum += arr[i]; 
            if (sum > maxi) {
                maxi = sum;
                start = tempStart;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        SubArraywithMaxSum sol = new SubArraywithMaxSum();

        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int maxSum = sol.maxSubArray(nums);
        int[] subarray = Arrays.copyOfRange(nums, sol.start, sol.end + 1);

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Subarray with Maximum Sum: " + Arrays.toString(subarray));
    }
}
