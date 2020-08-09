package jianzhi55_平衡二叉树;

import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 16:31
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
    HashMap<TreeNode,Integer> hashMap = new HashMap<>();
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        Core(root);
        for(TreeNode treeNode:hashMap.keySet()){
            if(hashMap.get(treeNode) >1){
                return false;
            }
        }
        return true;
    }

    public int Core(TreeNode root){
        int count = 0;
        if(root == null){
            return 0;
        }
        int left = Core(root.left);
        int right = Core(root.right);

        hashMap.put(root,Math.abs(left-right));
        return Math.max(left,right)+1;

    }
}
