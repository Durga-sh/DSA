//time complexity:O(n)
//space complexity:o(1)
public class missing{

    public static void main(String args[])
    {
        int []arr = {1,2,4,7,6,5};
        int n = arr.length;

         //sum of n natural numbers in an array
        int sum_of_elements = ((n+1)*(n+2))/2;

        int sum = 0;
        //sum of current elements present in array
        for(int i = 0;i<n;i++){
            sum += arr[i];

        }

        int miss_elem;
        miss_elem = sum_of_elements-sum ;
        System.out.println("Missing element is:" + miss_elem);

    }

}