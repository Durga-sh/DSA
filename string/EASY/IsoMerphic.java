package string.EASY;

import java.util.HashMap;

public class IsoMerphic{

    public static boolean isIsomorphic(String s1, String s2) {
        // Length check
        if (s1.length() != s2.length())
            return false;

        // Map to track character mapping from s1 to s2
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (map.containsKey(ch1)) {
                // If mapped, ensure it's consistent
                if (map.get(ch1) != ch2)
                    return false;
            } else {
                // Ensure no two characters map to same ch2
                if (map.containsValue(ch2))
                    return false;

                map.put(ch1, ch2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aab", "xxy"));
        System.out.println(isIsomorphic("aab", "xyz")); 
        System.out.println(isIsomorphic("paper", "title")); 
        System.out.println(isIsomorphic("foo", "bar"));
    }
}
