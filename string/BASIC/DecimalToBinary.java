package string.BASIC;

public class DecimalToBinary {
    public static String toBinary(int n) {
        String s = " ";

        while (n > 0) {
            s = (n % 2) + s;
            n = n / 2;
        }

        return s;
    }

    public static void main(String args[]) {
        int n = 15;
        String res = toBinary(n);
        System.out.println(res);

    }
}
