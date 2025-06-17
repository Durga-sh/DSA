package Array.MEDIUM;
import java.math.BigInteger;

public class NextPrimeNumber {

    public static void main(String[] args) {
        int n = 15; // example input
        BigInteger nextPrime = getNextPrime(n);
        System.out.println("Next prime is: " + nextPrime);
    }

    public static BigInteger getNextPrime(int n) {
        BigInteger next = BigInteger.valueOf(n).add(BigInteger.ONE);
        while (!next.isProbablePrime(10)) {
            next = next.add(BigInteger.ONE);
        }
        return next;
    }
}
