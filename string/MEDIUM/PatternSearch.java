// Time Complexity:O(n*m)
// Space Complexity:O(m)
package string.MEDIUM;

public class PatternSearch {
    public static int Pattern(String s, String pat) {
        int n = s.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            String res = s.substring(i, i + m);
            if (res.equals(pat)) {
                return i;
            }
        }
        return -1;

    }
    
    public static void main(String args[]) {
        String s = "ABABABCD";
        String pat = "ABCD";
        int result = Pattern(s, pat);
        System.out.println(result);
    }
}
