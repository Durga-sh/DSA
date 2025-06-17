package Linkedlist;

public class insertion1 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }

    //Implementation insertion ofnode at end

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        //Linked list is Empty
        if (head == null) {
            head = newNode;
            return;

        }

        //Linkedlist is not empty

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }

        temp.next = newNode;
        return;
    }
    // Implementation insertion ofnode at end

    public void insertatBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    // Implementation insertion ofnode After Any
    public void insertAfter(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println("The previous node can not contain null value");
            return;

        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    
    public void deleteNode(int position) {
        //Linkedlist is Empty
        if (head == null) {
            return;
        }

        Node temp = head;
        //deletion in the beginning
        if (position == 0) {
            head = temp.next;
            return;
        }
        //deletion is not in the beginning of the node
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;

        }
        if (temp == null && temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }
    
    // implementation of finding out the middle node in a linked list
    // two-pointer approach
    // what is the time and the space complexity of below method??
    public void middleNode() {
        Node slowPtr = head, fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        System.out.println("Middle data of a given linked list is: " + slowPtr.data);
    }

    // implementation of finding out the cycle in a linked list
    // floyd's cycle detection algorithm - interview based question
    // what is the time complexity and space complexity
    public void detectLoop() {
        Node slow = head, fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("No loop detected");
        } else {
            System.out.println("Loop is detected");
        }

    }

    //Implementation Of Displaying

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;

        }
    }
    
    public static void main(String[] args) {
        insertion1 list = new insertion1();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
    
        // list.display();
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.insertatBeginning(1);

        list.insertAfter(list.head.next.next, 13);
        list.display();
        System.out.println();

        list.deleteNode(3);
        System.out.println("Deletion of A node");

        list.display();
        list.middleNode();

        // circular linked list

        Node temp = list.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = list.head;

        list.detectLoop();

        System.out.println();

    }
}
