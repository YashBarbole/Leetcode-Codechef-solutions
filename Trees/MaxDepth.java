package Trees;

public class MaxDepth {

    // Inner TreeNode class
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
            this.right = right;
            this.left = left;
        }
    }

    // Recursive function to calculate max depth
    public int MaxDepth(TreeNode root) {
        if (root == null) return 0;

        int lh = MaxDepth(root.left);
        int rh = MaxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    // Main function
    public static void main(String[] args) {
        // Create object of outer class MaxDepth
        MaxDepth obj = new MaxDepth();

        // Build tree: 
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);

        // Call MaxDepth
        int depth = obj.MaxDepth(root);

        // Print result
        System.out.println("Max Depth of tree = " + depth);
    }
}
