package string.BASIC;

import java.util.Scanner;

public class pangram {

    public static boolean isPangram(String str) {

        str = str.toLowerCase();
        boolean[] letters = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (letters[i] == false) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a pangram:");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("✅ The string is a Pangram.");
        } else {
            System.out.println("❌ The string is NOT a Pangram.");
        }

        scanner.close();
    }
}
