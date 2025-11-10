package Trees;

import java.util.LinkedList;
import java.util.Queue;

//this is bruteforce method with on2 TC
public class LevelOrder {
     class TreeNode{
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
    LevelOrder obj = new LevelOrder();
    TreeNode root= obj.new TreeNode(1);
    root.left = obj.new TreeNode(2);
    root.right = obj.new TreeNode(3);
    root.left.left = obj.new TreeNode(4);
    root.left.right = obj.new TreeNode(5);
    root.right.left = obj.new TreeNode(6);
    root.right.right = obj.new TreeNode(7);

    int h=obj.MaxDepth(root);
    for (int i = 1; i <= h; i++) {//o(n2)
            obj.PrintCurrLevel(root, i);
            System.out.println(); 
            // new line after each level
        }
        System.out.println();
        System.out.println("another sol");
        System.out.println();
    obj.PrintLevelOrder(root);//o(n)
}
//o(n2
    void PrintCurrLevel(TreeNode root,int level){
            if(root==null)return;
            if(level==1) System.out.print(root.val+"");
            else if(level>1){
                PrintCurrLevel(root.left, level-1);
                PrintCurrLevel(root.right, level-1);
            }
    }
    int MaxDepth(TreeNode root) {
        if (root == null) return 0;
        int lh = MaxDepth(root.left);
        int rh = MaxDepth(root.right);
        return 1 + Math.max(lh, rh);
    }
//o(n)
    void PrintLevelOrder(TreeNode root){
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                if(q.isEmpty())return;
                q.add(null);
                System.out.println();
                continue;
            }

            System.out.print(curr.val);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);

        }
    }
}
