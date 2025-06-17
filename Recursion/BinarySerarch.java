package Recursion;

public class BinarySerarch {

    public static int binarySearch(int arr[], int low, int high, int x) {
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;

            } else if (arr[mid] < x) {
                return binarySearch(arr, mid + 1, high, x);
            } else {
                return binarySearch(arr, low, mid - 1, x);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 12, 14, 20, 25, 39, 42 };
        int low = 0;
        int x = 20;
        int high = arr.length - 1;
        int result = binarySearch(arr, low, high, x);
        System.out.println("The number is at digit " + result);
    }

}
