package BinaryTree.ESAY;

import java.util.*;

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

public class inOrder {

    // Inorder Traversal: Left → Root → Right
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.addAll(inorderTraversal(root.left));  // Visit left subtree
        list.add(root.val);                        // Visit root
        list.addAll(inorderTraversal(root.right)); // Visit right subtree

        return list;
    }

    // Example usage
    public static void main(String[] args) {
        inOrder sol = new inOrder();

        // Constructing the binary tree:
        //         1
        //          \
        //           2
        //          /
        //         3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = sol.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }
}
