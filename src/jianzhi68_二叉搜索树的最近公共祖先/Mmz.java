package jianzhi68_二叉搜索树的最近公共祖先;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 15:35
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        Mmz.TreeNode left = null;
        Mmz.TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else if(root.val <p.val && root.val < q.val) {
                root = root.right;
            }else {
                break;
            }
        }
        return root;
    }
}
