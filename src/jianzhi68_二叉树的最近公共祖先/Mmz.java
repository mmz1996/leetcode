package jianzhi68_二叉树的最近公共祖先;

import java.util.TreeMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 15:26
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        return root;
    }
}
