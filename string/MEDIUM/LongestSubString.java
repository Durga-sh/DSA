package string.MEDIUM;

import java.util.Arrays;

public class LongestSubString {
     public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];         // To store last seen indices of characters
        Arrays.fill(hash, -1);             // Initialize all as unseen (-1)

        int maxLen = 0;                    // Stores the maximum length
        int l = 0;                         // Left pointer of the sliding window

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            // If character is seen and within the current window
            if (hash[ch] != -1 && hash[ch] >= l) {
                l = hash[ch] + 1;          // Move left pointer past the last seen index
            }

            // Update max length
            maxLen = Math.max(maxLen, r - l + 1);

            // Update last seen index of current character
            hash[ch] = r;
        }

        return maxLen;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String testString = "abcabcbb";
        int result = lengthOfLongestSubstring(testString);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
