package string.MEDIUM;

public class StringToInt {
    public static int myAtoi(String s) {
        s = s.trim();
        long num = 0;
        if (s.isEmpty()) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        int n = s.length();
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * num);
    }

        public static void main(String[] args) {
        
        // Example test cases
        System.out.println(myAtoi("42"));             // Output: 42
        System.out.println(myAtoi("   -42"));         // Output: -42
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987"));   // Output: 0
        System.out.println(myAtoi("-91283472332"));    // Output: -2147483648 (Integer.MIN_VALUE)
    }
}