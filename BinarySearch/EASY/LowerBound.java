package BinarySearch.EASY;



public class LowerBound {

    public static int lowerBound(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= x) {
                ans = mid; // Possible lower bound found
                right = mid - 1; // Search further left
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5, 6, 8 }; // Sorted array
        int x = 4;

        int index = lowerBound(arr, x);
        if (index != -1)
            System.out.println("Lower Bound of " + x + " is at index: " + index + ", value: " + arr[index]);
        else
            System.out.println("No element ≥ " + x + " found.");
    }
}
