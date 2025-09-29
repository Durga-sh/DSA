package Linkedlist.BASIC;

public class insertion {
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

    public static Node insertHead(Node head, int val) {
        // Node newNode = new Node(val);
        // newNode.next = head;
        // head = newNode;
        // return head;
        Node temp = new Node(val, head);
        return temp;
    }

    public static Node insertAtend(Node head, int val) {

        Node newNode = new Node(val);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next = null;
        temp.next = newNode;

        return head;

    }
    
    public static Node insertAtk(Node head, int val, int k) {
        Node newNode = new Node(val);
        if (head == null) {
            if (k == 1) {
                head = newNode;
                return head;
            }
            return null;
        }

        if (k == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        int count = 0;
        Node temp = head;
        // Node prev = null;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
            // prev = temp;
            temp = temp.next;
        }
        return head;
    }
    
    public static Node insertbeforevalue(Node head,int el, int val) {
        Node newNode = new Node(el);
        if (head == null) {
            return null;
        }

        if (head.data == val) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        // int count = 0;
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
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
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 8, 7, 3 }; 
        Node head = converttoLL(arr);

        // Node head1 = insertHead(head, 10);
        // Node head1 = insertAtend(head, 5);
        // Node head1 = insertAtk(head, 15, 4);
        Node head1 = insertbeforevalue(head, 6, 3);
        print(head1);
    }


}
