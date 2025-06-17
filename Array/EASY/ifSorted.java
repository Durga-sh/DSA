package Array.EASY;

public class ifSorted {
    public static boolean check(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 7, 8 };
        System.out.println(check(arr));
    } 
}
