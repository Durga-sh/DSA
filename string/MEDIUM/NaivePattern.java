// Time Complexity:O(n*m)
// Space Complexity:O(m)
package string.MEDIUM;

public class NaivePattern {
    public static int Pattern(String s, String pat) {
        int n = s.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != s.charAt(i + j)) {
                    break;

                }

            }
            if (j == m) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        String s = "ABABCD";
        String pat = "ABCD";
        int result = Pattern(s, pat);
        System.out.println(result);
    }
}
