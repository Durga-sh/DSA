package string.EASY;

class Solution {
    // Function to find minimum number of characters to insert
    // so that the string doesn't have three consecutive same characters.
    public static long modified(String a) {
        // long count = 0;
        // int n = a.length();

        // for (int i = 0; i < n - 2; i++) {
        //     char ch1 = a.charAt(i);
        //     char ch2 = a.charAt(i + 1);
        //     char ch3 = a.charAt(i + 2);

        //     if (ch1 == ch2 && ch2 == ch3) {
        //         count++;
        //         // Skip one character ahead to avoid overlapping triples
        //         i += 1;
        //     }
        // }

        // return count;
        //Optimized 

        long count = 0;
        int consecutive = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                consecutive++;
                if (consecutive == 3) {
                    count++;
                    consecutive = 1;
                }
            } else {
                consecutive = 1;
            }

        }
        
        return count;
    }

    public static void main(String[] args) {
        String input = "aaaaaaa";
        long result = modified(input);
        System.out.println("Minimum characters to insert: " + result);
    }
}
