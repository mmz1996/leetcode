package question538_把二叉搜索树转换成累加树;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/8 23:05
 * @Created by mmz
 */


class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int sum = 0 ;
    public TreeNode convertBST(TreeNode root) {
        if(root != null){
            convertBST(root.right);
            sum +=root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}