package string.EASY;

public class NonRepeatingchar {

    static int nonRepeatingChar(String s) {
        int[] freq = new int[256]; // For all ASCII characters

        // First pass: count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Second pass: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        int index = nonRepeatingChar(input);

        if (index != -1) {
            System.out.println("First non-repeating character: '" + input.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
