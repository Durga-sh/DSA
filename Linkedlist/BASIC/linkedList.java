package Linkedlist.BASIC;

import java.util.LinkedList;

public class linkedList {
     static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
        }

     Node(int d) {
         data = d;
         next = null;
     }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 6, 8 };
        Node x = new Node(arr[0]);
        Node y = new Node(arr[1] , x );
        System.out.println(y.data);
        System.out.println(y.next);

    }
}
