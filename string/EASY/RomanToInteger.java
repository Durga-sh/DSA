package string.EASY;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = getValue(s.charAt(i));
            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }
            prev = curr;
        }

        return total;
    }

    // Method to return integer value of Roman character
    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    // Main method to test the conversion
    public static void main(String[] args) {
     

        String roman1 = "III";
        String roman2 = "IX";
        String roman3 = "LVIII";
        String roman4 = "MCMXCIV";

        System.out.println(roman1 + " → " + romanToInt(roman1)); // 3
        System.out.println(roman2 + " → " + romanToInt(roman2)); // 9
        System.out.println(roman3 + " → " + romanToInt(roman3)); // 58
        System.out.println(roman4 + " → " + romanToInt(roman4)); // 1994
    }
}
