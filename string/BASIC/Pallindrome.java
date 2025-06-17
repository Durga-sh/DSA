package string.BASIC;

// Java Program to Check if a String is Palindrome

public class Pallindrome {

    // Function to check if s is a palindrome
    public static boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase(); // Convert to lowercase for case-insensitive comparison

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false; // Mismatch found
            }
        }

        return true; // No mismatches found, so it's a palindrome
    }

    // Main method to test the function
    public static void main(String[] args) {
        String test1 = "Level";
        String test2 = "Java";

        System.out.println("Is '" + test1 + "' a palindrome? " + isPalindrome(test1));
        System.out.println("Is '" + test2 + "' a palindrome? " + isPalindrome(test2));
    }
}
