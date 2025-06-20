package string.EASY;

public class isRotateBy2{

    // Function to check if a string can be obtained by rotating another string by exactly 2 places
    public static boolean isRotated(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() < 2) {
            return false;
        }

        int n = s1.length();

        // Clockwise rotation by 2: last two characters + rest
        String rotate1 = s1.substring(n - 2) + s1.substring(0, n - 2);

        // Anti-clockwise rotation by 2: from index 2 to end + first two characters
        String rotate2 = s1.substring(2) + s1.substring(0, 2);
        if (s2.equals(rotate1) || s2.equals(rotate2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";

        if (isRotated(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1 + " by 2 places.");
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1 + " by 2 places.");
        }
    }
}


