package question617_合并二叉树;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 19:56
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null &&t2 == null){
            return  null;
        }
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        int value1 = t1==null?0:t1.val;
        int value2 = t2==null?0:t2.val;

        TreeNode treeNode = new TreeNode(value1+value2);

        treeNode.left = mergeTrees(t1.left,t2.left);
        treeNode.right = mergeTrees(t1.right,t2.right);
        return treeNode;
    }
}
