package jianzhi55_平衡二叉树;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/9 16:42
 * @Created by mmz
 */
public class Mmz1 {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return  Core(root) != -1;
    }

    public int Core(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Core(root.left);
        if(left == -1){
            return -1;
        }
        int right = Core(root.right);
        if(right == -1){
            return -1;
        }

        return Math.abs(left-right) >1?-1:Math.max(left,right)+1;
    }

}
