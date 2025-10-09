package Array.MEDIUM;

public class LongestSubArrayWithGivenSum {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int left = 0;
        int right = 0;
        int n = arr.length;
        int sum = 0;
        int maxlen = 0;

        while (right < n) {
            sum += arr[right];

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
        }

        return maxlen;

    }

    public static void main(String args[]) {

        LongestSubArrayWithGivenSum s = new LongestSubArrayWithGivenSum();

        int num[] = { 10, 5, 2, 7, 1, 10 };
        int res = s.longestSubarray(num, 15);
        System.out.println(res);
    }

}
