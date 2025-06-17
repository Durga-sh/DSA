package Recursion;

public class sumofDigits {

    //Function Definition

    public static int sumofDigit(int num) {
        
        //Base case condition
        if (num == 0) {
            return 0;

        }
        else {
            return (num % 10) + sumofDigit(num / 10);
        }
         
    }

    public static void main(String args[]) {
        int num = 123456;
        int result = sumofDigit(num);
        System.out.println("Sum of digit is " + result);
    }
    
}
