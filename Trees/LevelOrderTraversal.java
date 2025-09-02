package Trees;

import java.util.*;  // for List, ArrayList, Queue, LinkedList

public class LevelOrderTraversal {

    // ✅ Tree Node class
    static class TreeNode {
        int val;            // value of the node
        TreeNode left;      // left child
        TreeNode right;     // right child

        TreeNode(int val) {
            this.val = val;
        }
    }

    // ✅ Function to do Level Order Traversal
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result; // if tree is empty

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // start with root

        // while queue is not empty
        while (!queue.isEmpty()) {
            int size = queue.size();  // number of nodes in current level
            List<Integer> level = new ArrayList<>();

            // process each node in this level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();  // take out from queue
                level.add(node.val);           // add its value

                // put children in queue
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            result.add(level);  // one level completed
        }

        return result;
    }

    // ✅ MAIN FUNCTION
    public static void main(String[] args) {
        // make a sample tree
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // call level order function
        List<List<Integer>> ans = levelOrder(root);

        // print result
        System.out.println("Level Order Traversal:");
        for (List<Integer> level : ans) {
            System.out.println(level);
        }
    }
}
