package Recursion;

public class sumofDigits {

    //Function Definition

    public static int sumofDigit(int num) {

        //Recursion 
        
        //Base case condition
        // if (num == 0) {
        //     return 0;

        // }
        // else {
        //     return (num % 10) + sumofDigit(num / 10);
        // }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        int num = 453;
        int result = sumofDigit(num);
        System.out.println("Sum of digit is " + result);
    }
    
}
