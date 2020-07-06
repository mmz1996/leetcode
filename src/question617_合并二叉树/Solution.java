package question617_合并二叉树;

import javax.swing.tree.TreeNode;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/6 23:57
 * @Created by mmz
 */
public class Solution {
    /**
     * Definition for a binary tree node.
     */
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        if(t1 != null && t2 != null){
            t1.val +=t2.val;
        }
        t1.right = mergeTrees(t1.right,t2.right);
        t1.left = mergeTrees(t1.left,t2.left);
        return t1;
    }
}
