package BinarySearch.Medium;

import Array.MEDIUM.Solution;

public class searchinRotatedSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        
        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1; // search on the left side
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return first;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                last = mid;
                start = mid + 1; // search on the right side
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return last;
    }

    // You can add a main method to test it
    public static void main(String[] args) {
   
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);

        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }
}
