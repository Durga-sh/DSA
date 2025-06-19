package string.EASY;

import java.util.HashSet;

public class mumIndexChar {
    // Function to find the minimum indexed character.
    public static int minIndexChar(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        // Add all characters of s2 to the set
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }

        // Traverse s1 and return the first index where character is present in s2
        for (int i = 0; i < s1.length(); i++) {
            if (set.contains(s1.charAt(i))) {
                return i;
            }
        }

        return -1; // If no such character is found
    }

    // Main method to test the function
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "set";

        int index = minIndexChar(s1, s2);
        if (index != -1) {
            System.out.println("Minimum index of matching character: " + index);
            System.out.println("Character: " + s1.charAt(index));
        } else {
            System.out.println("No character from s2 is present in s1");
        }
    }
}
