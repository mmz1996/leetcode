package question538_把二叉搜索树转换成累加树;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 0:58
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int sum = 0;
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
