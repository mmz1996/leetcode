package jianzhi68_二叉树的最近公共祖先;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/25 17:31
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p){
            return root;
        }
        if(root == q){
            return root;
        }

        TreeNode left= lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }

        if(right != null){
            return right;
        }

        return null;
    }
}
