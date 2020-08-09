package question230_二叉树中第k小的元素;

import javax.xml.transform.Result;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/7 0:47
 * @Created by mmz
 */
public class Mmz {
    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int x) { val = x; }
    }

    static int result = 0;
    public static int kthSmallest(TreeNode root, int k) {
        return Core(root,k);
    }

    public static int Core(TreeNode root ,int k){
        if(root == null){
            return k;
        }
        k = Core(root.left,k);
        k--;
        if(k == 0){
            return root.val;
        }
        k =Core(root.right,k);
        return k;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);

        node3.left = node1;
        node1.right = node2;
        node3.right = node4;

        System.out.println(kthSmallest(node3, 1));
    }
}
