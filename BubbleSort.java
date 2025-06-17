package Sorting;

public class BubbleSort {

    public static void bubbleSort(int[]arr){

        for(int i=0;i<arr.length;i++){
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int []arr = {20,10,50,40,10};
        bubbleSort(arr);
        System.out.println("The sorted array is :"+arr);
        // System.out.println(Array.toString(arr));/

    }
    
}
