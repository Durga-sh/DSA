package string.EASY;

import java.util.Stack;

public class VaildParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {

        String test1 = "{[()]}";     // Valid
        String test2 = "{[(])}";     // Invalid
        String test3 = "((()))";     // Valid
        String test4 = "[({})]";     // Valid
        String test5 = "([)]";       // Invalid

        System.out.println(test1 + " → " + isValid(test1));
        System.out.println(test2 + " → " + isValid(test2));
        System.out.println(test3 + " → " + isValid(test3));
        System.out.println(test4 + " → " + isValid(test4));
        System.out.println(test5 + " → " + isValid(test5));
    }
}
