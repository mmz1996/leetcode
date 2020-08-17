package question543_二叉树的直径;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 23:36
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int max = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return max-1;
        }
        core(root);
        return max-1;
    }

    public int core(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = core(root.left);
        int right = core(root.right);
        max = Math.max(max,left+right+1);
        return Math.max(left,right)+1;
    }
}
