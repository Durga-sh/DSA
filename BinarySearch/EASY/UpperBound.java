package BinarySearch.EASY;

public class UpperBound {
    public static int UpperBound(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > x) {
                ans = mid; // Possible lower bound found
                right = mid - 1; // Search further left
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,6,7,8,8,11,11,11,12}; // Sorted array
        int x = 6;

        int index = UpperBound(arr, x);
        if (index != -1)
            System.out.println("Upper Bound of " + x + " is at index: " + index + ", value: " + arr[index]);
        else
            System.out.println("No element ≥ " + x + " found.");
    }
}
