package Linkedlist.MEDIUM;

// Node class for Linked List
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Add1toLL {

    // Function to add 1 to the linked list
    public Node addOne(Node head) {
        int carry = helper(head);

        // If carry still remains, create a new head node
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    // Recursive function to propagate carry
    private int helper(Node temp) {
        if (temp == null) {
            return 1; // Initial carry since we are adding 1
        }

        int carry = helper(temp.next);
        temp.data += carry;

        if (temp.data < 10) {
            return 0; // no carry
        } else {
            temp.data = 0; // set digit to 0 and carry forward
            return 1;
        }
    }

    // Utility method to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Utility method to create a linked list from array
    public static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] digits = { 9, 9, 9 }; // Example: number = 999

        Node head = createList(digits);

        System.out.print("Original number: ");
        printList(head);

        Add1toLL obj = new Add1toLL();
        head = obj.addOne(head);

        System.out.print("After adding 1: ");
        printList(head);
    }
}
