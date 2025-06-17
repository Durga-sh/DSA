package string.EASY;

public class RemoveParanthesis{

    // Method to remove outermost parentheses
    public static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                count--;
            }

            if (count != 0) {
                ans.append(ch);
            }

            if (ch == '(') {
                count++;
            }
        }

        return ans.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        String result = removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
