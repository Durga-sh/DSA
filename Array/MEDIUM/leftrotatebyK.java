package Array.MEDIUM;

public class leftrotatebyK {
    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static int[] reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Array Before Rotation");
        printArray(arr);
        rotate(arr, 3);
        System.out.println("Array After Rotation");
        printArray(arr);
    }
}
