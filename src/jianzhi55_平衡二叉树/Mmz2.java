package jianzhi55_平衡二叉树;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/8/26 12:44
 * @Created by mmz
 */
public class Mmz2 {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return core(root) != -1;

    }


    public int core(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = core(root.left);
        if(left == -1){
            return -1;
        }
        int right = core(root.right);
        if(right == -1){
            return -1;
        }

        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;

    }
}
