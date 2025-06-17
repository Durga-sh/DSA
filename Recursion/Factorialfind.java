package Recursion;

import java.util.Scanner;

public class Factorialfind {

    public static int factorialFinding(int n) {
        int result = 0;
        // Base case Condition
        if (n == 0 || n == 1) {
            return 1;

        } else {
            // Recursive Function Calling
            result = n * factorialFinding(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int n = sc.nextInt();

        int result = factorialFinding(n);
        System.out.println("Factorial of a number is " + result);

    }

}
