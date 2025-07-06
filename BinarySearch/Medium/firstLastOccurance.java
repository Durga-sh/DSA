package BinarySearch.Medium;



public class firstLastOccurance {
     public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[mid] >= arr[low]) {
                // Target is in the left sorted part
                if (arr[mid] >= target && target >= arr[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                // Target is in the right sorted part
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(arr, target);
        System.out.println("Target found at index: " + result);
    }
}
