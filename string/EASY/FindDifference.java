package string.EASY;

public class FindDifference {

    public char findTheDifference(String s, String t) {
        int[] count = new int[26]; // Only lowercase English letters

        // Count each character in string s
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Subtract each character using string t
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
            if (count[ch - 'a'] < 0) {
                return ch; // Found the extra character
            }
        }

        return ' '; // Fallback return (won't be reached in valid input)
    }

    public static void main(String[] args) {
        FindDifference sol = new FindDifference();

        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("Extra character: " + sol.findTheDifference(s1, t1)); // Output: e

        String s2 = "";
        String t2 = "y";
        System.out.println("Extra character: " + sol.findTheDifference(s2, t2)); // Output: y

        String s3 = "aabbcc";
        String t3 = "abcbacc";
        System.out.println("Extra character: " + sol.findTheDifference(s3, t3)); // Output: c
    }
}
