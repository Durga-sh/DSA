package BinaryTree.MEDIUM;

import java.util.*;

// Node class definition
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

// Solution class containing boundary traversal logic
class Solution {
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (root == null) return ans;
        
        if (!isLeaf(root)) ans.add(root.data);

        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);

        return ans;
    }

    // Utility to check if node is leaf
    boolean isLeaf(Node node) {
        return node != null && node.left == null && node.right == null;
    }

    // Add left boundary nodes (excluding leaf nodes)
    void addLeftBoundary(Node root, ArrayList<Integer> ans) {
        Node curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) ans.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    // Add right boundary nodes (excluding leaf nodes)
    void addRightBoundary(Node root, ArrayList<Integer> ans) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (!isLeaf(curr)) temp.add(curr.data);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        // Add right boundary in reverse order
        for (int i = temp.size() - 1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }

    // Add all leaf nodes (from left to right)
    void addLeaves(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }
        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }
}

// Driver code to test
public class BoundaryTraversal {
    public static void main(String[] args) {
        /*
                20
               /  \
              8   22
             / \    \
            4  12    25
               / \
              10 14
        */
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        Solution sol = new Solution();
        ArrayList<Integer> result = sol.boundaryTraversal(root);
        
        System.out.println("Boundary Traversal of tree:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
