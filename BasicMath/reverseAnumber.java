package BasicMath;
public class reverseAnumber {
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 1234;
        int reversedNumber = reverse(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
