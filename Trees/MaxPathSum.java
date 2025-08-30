package Trees;

public class MaxPathSum {
    
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
    public static void main(String[] args) {
    MaxPathSum obj = new MaxPathSum();
    
    // Build a tree:
    //        -10
    //       /   \
    //      9     20
    //           /  \
    //          15   7
    //
    TreeNode root = obj.new TreeNode(-10);
    root.left = obj.new TreeNode(9);
    root.right = obj.new TreeNode(20);
    root.right.left = obj.new TreeNode(15);
    root.right.right = obj.new TreeNode(7);
    
    int result = obj.MaxPathSum(root);
    System.out.println("Maximum Path Sum: " + result);
}

    public int MaxPathSum(TreeNode root){
        int maxValue[]=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        MaxPathDown(root, maxValue);
        return maxValue[0];
    }

    public int MaxPathDown(TreeNode root,int maxValue[]){
        if(root==null) return 0;
        int left=Math.max(0,MaxPathDown(root.left, maxValue));
        int right=Math.max(0,MaxPathDown(root.right, maxValue));
        maxValue[0]=Math.max(maxValue[0], left+right+root.val);
        return Math.max(left,right)+root.val;
    }

}
