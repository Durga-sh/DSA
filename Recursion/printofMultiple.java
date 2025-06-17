package Recursion;

import java.util.Scanner;

public class printofMultiple {

    public static void printMult(int n, int k) {

        if (k == 1) {
            System.out.println(n);
            return;

        }
        else {
            printMult(n, k - 1);
           System.out.println(n * k);

        }     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMult(n, k);

    }
}
