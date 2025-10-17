package string.EASY;

import java.util.Scanner;

public class rotateStringByK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        // Reduce k to avoid unnecessary rotations if k is greater than string length
        int length = s.length();
        k = k % length;

        char[] chars = s.toCharArray();

        // Perform the rotation k times
        for (int i = 0; i < k; i++) {
            char firstChar = chars[0];
            // Shift all other characters to the left
            for (int j = 1; j < length ; j++) {
                chars[j - 1] = chars[j];
            }
            // Put the first character at the end
            chars[length - 1] = firstChar;
        }

        String rotatedString = new String(chars);
        System.out.println(rotatedString);
    }

}
