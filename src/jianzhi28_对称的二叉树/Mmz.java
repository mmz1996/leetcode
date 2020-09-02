package jianzhi28_对称的二叉树;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 0:24
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return Core(root.left,root.right);
    }

    public boolean Core(TreeNode left,TreeNode right){
        if(left== null  && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }else{
            return Core(left.left,right.right) &&Core(left.right,right.left);
        }
    }
}
