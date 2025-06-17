package Recursion;

import java.util.Scanner;

public class alternateSumSeries {

    public static int alternateSum(int num) {
        // Base case condition
        if (num == 0) {
            return 0;
        }
        // Recursion function call
        // even Number
        if (num % 2 == 0) {
            return alternateSum(num - 1) - num;
        }
        // Odd Number
        else {
            return alternateSum(num - 1) + num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int result = alternateSum(num);

        System.out.println("The sum  of Alternate Number is " + result);
    }

}
