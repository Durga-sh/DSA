package string.EASY;

public class Reverse {
    public static String reverse(String s) {
        String b = " ";
        int n = s.length();
        int ptr = n - 1;

        while (ptr >= 0) {
            b = b + s.charAt(ptr);
            ptr--;
        }
        return b;
    }


    public static void main(String args[]) {
        String s = "Durga";
        System.out.println(reverse(s));
        
    }
}
