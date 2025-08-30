package Trees;

public class SameTree {
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
    SameTree obj1=new SameTree();

    TreeNode root = obj1.new TreeNode(-10);
    root.left = obj1.new TreeNode(9);
    root.right = obj1.new TreeNode(20);
    root.right.left = obj1.new TreeNode(15);
    root.right.right = obj1.new TreeNode(7);
    
    SameTree obj2= new SameTree();
    TreeNode root2 = obj2.new TreeNode(-10);
    root2.left = obj2.new TreeNode(9);
    root2.right = obj2.new TreeNode(20);
    root2.right.left = obj2.new TreeNode(15);
    root2.right.right = obj2.new TreeNode(7);

    System.out.println(obj1.CheckSame(root, root2));
    
    }

    public boolean CheckSame(TreeNode root1,TreeNode root2){
        if(root1==null|| root2==null)return root1==root2;
        return(root1.val==root2.val)&& CheckSame(root1.left, root2.left)&& CheckSame(root1.right, root2.right);
    }
}
