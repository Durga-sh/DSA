package Linkedlist.HARD;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseNodeinKgroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;

        // Initialize a pointer to track the
        // last node of the previous group
        ListNode prevLast = null;

        // Traverse through the linked list
        while (temp != null) {

            // Get the Kth node of the current group
            ListNode kThNode = getKthNode(temp, k);

            // If the Kth node is NULL (not a complete group)
            if (kThNode == null) {

                // If there was a previous group, link the last node
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break; // Exit loop
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            // Reverse the current group
            reverseList(temp);

            if (temp == head) {
                head = kThNode;
            } else {
                prevLast.next = kThNode;
            }

            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }

    // Get the kth node from current pointer
    public static ListNode getKthNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    // Recursive method to reverse a linked list
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    // Utility method for testing
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method for quick test
    public static void main(String[] args) {
        ReverseNodeinKgroup obj = new ReverseNodeinKgroup();

        // Create a linked list: 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        int k = 2;
        head = obj.reverseKGroup(head, k);

        System.out.println("Reversed in groups of " + k + ":");
        printList(head);
    }
}
