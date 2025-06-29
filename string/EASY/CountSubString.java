//Time Complexity  = O(n^3);
//Space Complexity = O(n);


package string.EASY;

import java.util.HashSet;
import java.util.Set;
public class CountSubString {
    public static int Count(String s) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                set.add(s.substring(i, j));

            }
        }

        return set.size();

    }

    public static void main(String args[]) {
        String s = "aaaa";
        int res = Count(s);
        System.out.println(res);
        
    }
}
