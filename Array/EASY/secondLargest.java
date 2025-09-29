package Array.EASY;

public class secondLargest {
    public static int findSecondlargest(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 7, 2, 1, 9, 8 , 10 };

        int secondlargest = findSecondlargest(arr);

        System.out.println("the eSecond Largest Element is " + secondlargest);
    }
}
