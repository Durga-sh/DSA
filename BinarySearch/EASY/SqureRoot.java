package BinarySearch.EASY;

import Array.MEDIUM.Solution;

public class SqureRoot {
     public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 2;
        int right = x / 2;
        int ans = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long num = (long) mid * mid;

            if (num == x) {
                return mid;
            } else if (num < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 26;
        int sqrt = mySqrt(x);

        System.out.println("Integer square root of " + x + " is: " + sqrt);
    }
}
