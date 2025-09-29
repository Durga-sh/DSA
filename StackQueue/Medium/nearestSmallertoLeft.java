package StackQueue.Medium;

import java.util.Stack;

public class nearestSmallertoLeft {
    public static int[] nextGreatrerElement(int nums[]) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i<=n-1; i++) {
            while (st.isEmpty() == false && st.peek() >= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(nums[i]);
        }
        return nge;
    }
    
    public static void main(String[] var0) {
        int[] var1 = new int[] { 4,5,2,10,12};
        int[] var2 = nextGreatrerElement(var1);
        System.out.println("The next greater elements are ");

        for (int var3 = 0; var3 < var2.length; ++var3) {
            System.out.print(var2[var3] + " ");
        }

    }

}
