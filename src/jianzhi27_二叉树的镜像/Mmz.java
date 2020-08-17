package jianzhi27_二叉树的镜像;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 0:18
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

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Core(root);
        return root;
    }

    public TreeNode Core(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = Core(root.right);
        root.right = Core(temp);

        return root;
    }
}
