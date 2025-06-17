package Array.MEDIUM;

public class RightRotateByK {

    public static void rightRotate(int arr[], int k) {
        int n = arr.length;
        if (n == 0 || k <= 0)
            return;

        // Normalize k if it's larger than n
        k = k % n;

        // Step 1: Reverse the whole array
        reverse(arr,0, n-1 );
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k-1 );
        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Utility method to reverse elements in array from index 'start' to 'end'
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1 , 2, 3 , 4 ,5};
        int k = 2; // Number of steps to rotate

        System.out.println("Original Array:");
        printArray(arr);

        rightRotate(arr, k);

        System.out.println("Array after Right Rotation by " + k + " steps:");
        printArray(arr);
    }
}
