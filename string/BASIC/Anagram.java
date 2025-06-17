package string.BASIC;

public class Anagram{

    static final int CHAR = 256;

    // Function to check if two strings are anagrams
    static boolean areAnagram(String s1, String s2) {
        // If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create a count array of size 256 for all ASCII characters
        int[] count = new int[CHAR];

        // Update the count array: +1 for s1 and -1 for s2
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        // If all values in the count array are 0, then it's an anagram
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagram(str1, str2)) {
            System.out.println("✅ The strings are anagrams.");
        } else {
            System.out.println("❌ The strings are NOT anagrams.");
        }
    }
}
