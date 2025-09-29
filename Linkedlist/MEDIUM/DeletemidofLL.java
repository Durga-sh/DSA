package Linkedlist.MEDIUM;

// Definition for singly-linked list
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

public class DeletemidofLL {

    public static ListNode deleteMiddle(ListNode head) {
        // If list is empty or has only one element, return null
        // if (head == null || head.next == null) {
        //     return null;
        // }

        // int n = 0;
        // ListNode temp = head;

        // // Step 1: Count number of nodes
        // while (temp != null) {
        //     n++;
        //     temp = temp.next;
        // }

        // // Step 2: Find the middle position
        // int k = n / 2;

        // // Step 3: Traverse again and delete the middle node
        // temp = head;
        // int count = 0;
        // while (temp != null) {
        //     if (count == k - 1) {
        //         temp.next = temp.next.next;
        //         break;
        //     }
        //     count++;
        //     temp = temp.next;
        // }

        // return head;


        // More Optimized

        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        head = deleteMiddle(head);

        System.out.println("\nList After Deleting Middle:");
        printList(head);
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

