package BasicMath;

public class printAllDivisors {

    // TC = O(n)
    public static void printDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
    
    // TC =O(√n)
    
    // public static void printDivisor(int n) {
    //     int intResult = (int) Math.sqrt(n);
    //     for (int i = 1; i <= intResult; i++) {
    //         if (n % i == 0) {
    //             System.out.println(i);
    //             if (n / i != i) {
    //                 System.out.println(n / i);
    //             }
    //         }
    //     }
    // }
    public static void main(String args[]) {
        printDivisor(36);
    }
}
