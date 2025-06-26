package string.MEDIUM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseSpecificSorting {
        public static String caseSort(String str) {
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        // Step 1: Separate uppercase and lowercase characters
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper.add(c);
            } else {
                lower.add(c);
            }
        }

        // Step 2: Sort both lists
        Collections.sort(upper);
        Collections.sort(lower);

        // Step 3: Rebuild the result string preserving original case positions
        StringBuilder result = new StringBuilder();
        int upperIndex = 0, lowerIndex = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(upper.get(upperIndex++));
            } else {
                result.append(lower.get(lowerIndex++));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "GEekS";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + caseSort(input1)); // Expected: EGekS

        // Example 2
        String input2 = "XWMSPQ";
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + caseSort(input2)); // Expected: MPQSWX
    }
}
