//time complexity = O(n^2)

package Sorting;

import java.util.*;


public class SelectionSort {

    public static void SelectionSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int min_inex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_inex]){
                    min_inex = j;

                }
            }

            if(min_inex!=i){
                //swap between arr
                int temp= arr[min_inex];
                arr[min_inex] = arr[i];
                arr[i] = temp;

            }
        }
    }




    public static void main(String []args){
         int arr[] = {20,50,12,17,19,25,97,16};
        SelectionSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
    
}
