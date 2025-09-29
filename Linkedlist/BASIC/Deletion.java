package Linkedlist.BASIC;

public class Deletion {
    static class Node {
        int data;
        Node next;

        Node(int d1, Node next1) {
            data = d1;
            next = next1;

        }

        Node(int data) {
            this.data = data;
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

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }
    //delete Last Node 

    public static Node deleteTail(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    public static Node deletekKth(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }
    
    public static Node deletevalue(Node head, int value) {
        if (head == null) {
            return head;
        }
        if (head.data== value) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == value) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }
   

    public static void main(String args[]) {
        int arr[] = { 12, 8, 7, 3 };
        Node head = converttoLL(arr);
        // Node head1 = removeHead(head);
        // print(head1);
        // Node head1 = deleteTail(head);
        // Node head1 = deletekKth(head, 1);
        Node head1 = deletevalue(head, 8);
        print(head1);
    }

}
