package StackQueue.Medium;

import java.util.Stack;

public class nxtGreater {

    public static int[] nextGreatrerElement(int nums[]) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i]) {
                st.pop();
            }
            // for find nextSmaller Element
            // while (st.isEmpty() == false && st.peek() > nums[i]) {
            //     st.pop();
            // }
            if (st.isEmpty()) {
                nge[i] = -1;
            }
            else {
                 nge[i] = st.peek();
            }
           
            st.push(nums[i]);
        }
        return nge;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 7, 1, 2, 6, 0 };

        int arr2[] = nextGreatrerElement(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    }
    

