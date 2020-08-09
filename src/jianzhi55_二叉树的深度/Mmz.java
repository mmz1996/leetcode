package jianzhi55_二叉树的深度;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/10 0:36
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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return Core(root);
    }

    public int Core(TreeNode root){
        int count = 0;
        if(root == null){
            return count;
        }

        int left = Core(root.left);
        int right = Core(root.right);

        return Math.max(left,right)+1;


    }
}
