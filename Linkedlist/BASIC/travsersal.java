package Linkedlist.BASIC;

public class travsersal {
    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int d) {
            data = d;
        }
    }

    public static Node converttoLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int lengthofLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    public static int checkifPresent(Node head , int val) {
        Node temp = head;
        while (temp != null) {
            if(temp.data == val)return 1;
            temp = temp.next;
       
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = converttoLL(arr);
    

        // System.out.println(lengthofLL(head));
    //    System.out.println(checkifPresent(head, 12)); 
    // For Travsersal
        Node temp = head;
        while (temp != null) {
            System.err.println(temp.data);
            temp = temp.next;
        }
        // System.out.println(head.data);
    }
}
