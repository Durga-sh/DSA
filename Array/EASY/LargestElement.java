package Array.EASY;



public class LargestElement {
    public static int Largest(int arr[]) {
        int largest = arr[0];
    
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } 

        }
        
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 1, 4 }; // Example input
        System.out.println("Largest Element Of an Array  is: " + Largest(arr));
    }
}
