
package Array.EASY;
import java.util.Arrays;

public class prefixSum {
    public static int[] computePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];

        if (arr.length == 0) return prefixSum;

        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = computePrefixSum(arr);

        System.out.println("Prefix Sum Array: " + Arrays.toString(result));
    }
}
