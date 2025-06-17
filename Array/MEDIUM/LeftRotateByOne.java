package Array.MEDIUM;

public class LeftRotateByOne {

    public static void leftRotateByOne(int arr[]) {
        int n = arr.length;
        if (n == 0)
            return; // Edge case: empty array

        int first = arr[0]; // Store the first element

        // Shift all elements to the left by one
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = first; // Place the first element at the end
    }

    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Original Array:");
        printArray(arr);

        leftRotateByOne(arr);

        System.out.println("Array after Left Rotation by One:");
        printArray(arr);
    }
}
