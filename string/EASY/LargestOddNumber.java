package string.EASY;

public class LargestOddNumber {

    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";

    }
    
    public static void main(String args[]) {
        String s ="156425";
        System.out.println(largestOddNumber(s));

    }    

    }

