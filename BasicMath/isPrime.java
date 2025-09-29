package BasicMath;

// A number that Has Exactly Two factors 1 And ItSelf is called a prime Number 
public class isPrime {
    public static boolean checkPrime(int n) {

        // TC = O(n)
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // return true;
        // }
        // return false;

        int count = 0;
        // We need to check till Squre root of that Number 
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int n = 11;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is Not a prime Number");
        }
    }
}
