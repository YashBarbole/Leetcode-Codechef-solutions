package Trees;

import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversal {

    public class TreeNode {
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

    // ✅ Check if node is leaf
    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    // ✅ Add left boundary (excluding leaf nodes)
    public void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) res.add(curr.val);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    // ✅ Add right boundary (excluding leaf nodes, in reverse)
    public void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (!isLeaf(curr)) temp.add(curr.val);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        // reverse order
        Collections.reverse(temp);
        res.addAll(temp);
    }

    // ✅ Add all leaf nodes
    public void addLeaves(TreeNode root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }

    // ✅ Main Boundary Traversal Function
    public ArrayList<Integer> boundaryTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (!isLeaf(root)) res.add(root.val); // add root if not leaf
        addLeftBoundary(root, res);           // add left boundary
        addLeaves(root, res);                 // add all leaves
        addRightBoundary(root, res);          // add right boundary

        return res;
    }

    // ✅ Example Run
    public static void main(String[] args) {
        BoundaryTraversal bt = new BoundaryTraversal();

        // Create a tree:
        /*
                   1
                 /   \
                2     3
               / \   / \
              4   5 6   7
                 / \
                8   9
        */
        TreeNode root = bt.new TreeNode(1);
        root.left = bt.new TreeNode(2);
        root.right = bt.new TreeNode(3);
        root.left.left = bt.new TreeNode(4);
        root.left.right = bt.new TreeNode(5);
        root.left.right.left = bt.new TreeNode(8);
        root.left.right.right = bt.new TreeNode(9);
        root.right.left = bt.new TreeNode(6);
        root.right.right = bt.new TreeNode(7);

        ArrayList<Integer> result = bt.boundaryTraversal(root);
        System.out.println("Boundary Traversal: " + result);
    }
}
