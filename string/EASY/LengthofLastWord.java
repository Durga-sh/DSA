package string.EASY;

public class LengthofLastWord {

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        

        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
       

        int res1 = lengthOfLastWord(input1);
        int res2 = lengthOfLastWord(input2);

        System.out.println(res1);
        System.out.println(res2);



    }
}
