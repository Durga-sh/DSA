package string.EASY;

public class MaximumNestingDepth {
    public static int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (c == ')') {
                count--;
            }
        }

        return maxCount;
    }

    // Main method to test the code
    public static void main(String[] args) {
  
        String test1 = "(1+(2*3)+((8)/4))+1"; // Max depth = 3
        String test2 = "(1)+((2))+(((3)))"; // Max depth = 3
        String test3 = "1+(2*3)/(2-1)"; // Max depth = 1
        String test4 = "1"; // Max depth = 0

        System.out.println("Max depth of test1: " + maxDepth(test1));
        System.out.println("Max depth of test2: " + maxDepth(test2));
        System.out.println("Max depth of test3: " + maxDepth(test3));
        System.out.println("Max depth of test4: " + maxDepth(test4));
    }
}
