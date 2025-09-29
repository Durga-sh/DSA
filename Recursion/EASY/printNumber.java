package Recursion.EASY;

import java.util.Scanner;

public class printNumber {
    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        else {
            System.out.println("Durga");
            print(i+1, n);
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of time u want to print the name ");
        int n = sc.nextInt();
        print(1, n);
    }
}
