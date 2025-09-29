package BasicMath;

import java.util.Scanner;

public class isapllindrome {

    public  boolean isPalindrome(int x) {
        if (x < 0)
            return false; // Negative numbers are not palindromes
        int Ref = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return reversed == Ref;
    }

    public static void main(String[] args) {
        isapllindrome obj = new isapllindrome();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (obj.isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
