package string.EASY;

import java.util.HashSet;

public class LongestPallindrome {
     public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);  // Found a pair
                length += 2;    // Each pair contributes 2
            } else {
                set.add(c);     // First occurrence, wait for its pair
            }
        }

        // Add 1 if there's any unpaired character for the center of the palindrome
        if (!set.isEmpty()) {
            length += 1;
        }

        return length;
    }

    // Main method to test the code
    public static void main(String[] args) {

        String input = "abccccdd";
        int result = longestPalindrome(input);

        System.out.println("Longest palindrome length: " + result);
    }
}
