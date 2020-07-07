package question104_二叉树的最大深度;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/7 22:20
 * @Created by mmz
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Core(root);
    }
    public int Core(TreeNode root){
        int count = 0;
        int left = 0;
        int right = 0;
        if(root == null){
            return 1;
        }
        if(root.left != null){
            left = Core(root.left);
        }
        if(root.right != null){
            right = Core(root.right);
        }
        return Math.max(right,left)+1;
    }
}
