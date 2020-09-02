package jianzhi68_二叉搜索树的最近公共祖先;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 12:19
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
        while (root != null){
            if(root.val > p.val && root.val>q.val){
                root = root.left;
            }else if(root.val < p.val && root.val < q.val){
                root= root.right;
            }else{
                break;
            }
        }
        return root;
    }
}
