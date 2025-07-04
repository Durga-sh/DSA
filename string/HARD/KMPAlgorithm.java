package string.HARD;

public class KMPAlgorithm {

    // KMP search: returns index of first occurrence of pattern in text, or -1 if
    // not found
    public static int kmpSearch(String text, String pattern) {
        if (pattern.length() == 0)
            return 0;

        // Create LPS array for pattern
        int[] lps = computeLPSArray(pattern);

        int i = 0; // index for text
        int j = 0; // index for pattern

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return i - j; // pattern found, return starting index
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // fallback using LPS array
                } else {
                    i++; // no match, move to next character in text
                }
            }
        }

        return -1; // pattern not found
    }

    // Compute LPS (Longest Prefix Suffix) array
    private static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // length of previous longest prefix suffix
        int i = 1;

        // First position is always 0
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        // Test cases
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";

        int index = kmpSearch(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found");
        }

        // Additional test case
        text = "ABABDABACDABABCABAB";
        pattern = "ABABCABAB";

        index = kmpSearch(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }
}