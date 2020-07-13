package question543_二叉树的直径;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 18:03
 * @Created by mmz
 */
public class Solution {
   public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
  int ans = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return ans-1;
        }
        Core(root);
        return ans-1;
    }

    public int Core(TreeNode root){

        if(root == null){
            return 0;
        }
        int left = Core(root.left);
        int right = Core(root.right);
        ans = Math.max(ans,(left+right+1));
        return Math.max(left,right)+1;
    }
}
