package BinaryTree.ESAY;
import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class postOrder {

    // Postorder Traversal: Left → Right → Root
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        list.addAll(postorderTraversal(root.left));   // Left subtree
        list.addAll(postorderTraversal(root.right));  // Right subtree
        list.add(root.val);                           // Root node

        return list;
    }

    // Example usage
    public static void main(String[] args) {

        // Constructing the binary tree:
        //        1
        //         \
        //          2
        //         /
        //        3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = postorderTraversal(root);
        System.out.println("Postorder Traversal: " + result);
    }
}
