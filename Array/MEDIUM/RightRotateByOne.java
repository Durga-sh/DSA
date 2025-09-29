
package Array.MEDIUM;

public class RightRotateByOne {

    public static void rightRotateByOne(int arr[]) {
        int n = arr.length;
        if (n == 0)
            return; // Edge case: empty array

        int last = arr[n - 1]; // Store the last element

        // Shift all elements to the left by one
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = last; // Place the first element at the end
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

        rightRotateByOne(arr);

        System.out.println("Array after Right Rotation by One:");
        printArray(arr);
    }
}
