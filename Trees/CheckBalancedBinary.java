package Trees;

import JAVA_ARRAYS.removeDupli;

public class CheckBalancedBinary {
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
        CheckBalancedBinary obj=new CheckBalancedBinary();
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);
        root.left.right = obj.new TreeNode(5);
        System.out.println(obj.Check(root));

    }
    public boolean  Check(TreeNode root){
        return dfsHeight(root)!=-1;
    }
            int dfsHeight(TreeNode root){
            if(root==null)return 0;
            int lh=dfsHeight(root.left);
            if(lh==-1)return -1;
            int rh=dfsHeight(root.right);
            if(rh==-1)return -1;
            if(Math.abs(lh-rh)>1){
                return -1;
            }
            return Math.max(lh,rh)+1;
            
            
    }     
}













