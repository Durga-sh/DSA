import java.util.Arrays;

public class MissingNumber {
    public static int findMissing(int[] arr , int n  ) {
        // int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        // for ( int i = 0 ; i<n ; i++) {
        //     actualSum += i;
        // }
        for(int num:arr){
            actualSum += num ;
        }
        System.out.println(expectedSum);
        System.out.println(actualSum);

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1}; // Missing number is 3
        int n =8; // Range of numbers
        
        System.out.println("Missing Number: " + findMissing(arr, n ));
    }
}
