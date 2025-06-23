package string.EASY;

public class IsSubsequence {
   

        public static boolean isSubsequence(String s, String t) {
            int indexInT = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                // Search for the character 'ch' in 't' starting from indexInT
                indexInT = t.indexOf(ch, indexInT);
                if (indexInT == -1) {
                    return false; // Character not found; not a subsequence
                }
                indexInT++; // Move to next position in 't'
            }

            return true;
        }

        public static void main(String[] args) {

            String s1 = "abc";
            String t1 = "ahbgdc";
            System.out.println("Is Subsequence: " + isSubsequence(s1, t1)); // true

            String s2 = "axc";
            String t2 = "ahbgdc";
            System.out.println("Is Subsequence: " + isSubsequence(s2, t2)); // false

            String s3 = "";
            String t3 = "anything";
            System.out.println("Is Subsequence: " + isSubsequence(s3, t3)); // true (empty string is always a
                                                                                // subsequence)

            String s4 = "ace";
            String t4 = "abcde";
            System.out.println("Is Subsequence: " +isSubsequence(s4, t4)); // true
        }
    }
    

