package BasicMath;

import java.util.Scanner;

// 371 = 3^3 + 7^3 + 1^3 = 371
public class Armstrong {
    public static boolean isArmStrong(int n) {
        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        return sum == originalNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (isArmStrong(n)) {
            System.out.println(n + " is a Armstrong Number");
        } else {
            System.out.println(n + " is not a Armstrong Number");
        }

        sc.close();

    }
}
