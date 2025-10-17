package BinaryTree.ESAY;

import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class preOrder {

    // Preorder Traversal: Root → Left → Right
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.add(root.val);                         // Visit root
        list.addAll(preorderTraversal(root.left));  // Visit left subtree
        list.addAll(preorderTraversal(root.right)); // Visit right subtree

        return list;
    }

    // Example usage
    public static void main(String[] args) {

        // Constructing the binary tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        List<Integer> result = preorderTraversal(root);
        System.out.println("Preorder Traversal: " + result);
    }
}
