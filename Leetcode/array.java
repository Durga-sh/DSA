import java.util.Arrays;

public class array {

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 2, 5, 6 };
        int res[] = new int[arr1.length + arr2.length];
        int m = arr1.length;
        int n = arr2.length;
        for (int i = 0; i < m; i++) {
            res[i] = arr1[i];

        }

        for (int i = 0; i < n; i++) {
            res[arr1.length + i] = arr2[i];

        }
        System.out.println("new Array" + Arrays.toString(res));
    }

}
