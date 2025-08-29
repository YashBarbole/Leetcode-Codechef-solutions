package Trees;

public class Diameter {
    public class TreeNode{
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
        Diameter obj=new Diameter();
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);
        root.left.right = obj.new TreeNode(5);
        System.out.println(obj.diameterOfBinaryTree(root));
    }

    public  int diameterOfBinaryTree(TreeNode root){
        int[] diameter = new int[1]; // array used to store max value
        height(root, diameter);
        return diameter[0];
    }

    public int height(TreeNode root,int[] diameter){
        if(root==null) return 0;

        int lh=height(root.left, diameter);
        int rh=height(root.right, diameter);

        diameter[0]=Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);
    }


}
