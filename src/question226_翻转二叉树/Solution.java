package question226_翻转二叉树;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/7 22:05
 * @Created by mmz
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode now = root.right;
        root.right = root.left;
        root.left = now;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
