package BasicMath;

public class prime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

}
