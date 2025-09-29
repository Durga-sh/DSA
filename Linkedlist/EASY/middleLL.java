package Linkedlist.EASY;

import Array.MEDIUM.Solution;

public class middleLL {
     static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
     public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode middle = middleNode(head);

        // Print from middle to end
        System.out.print("Middle Node onwards: ");
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}
