package question437_路径综合;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 3:06
 * @Created by mmz
 */
public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int pathSum(TreeNode root, int sum) {
        int count =  0;
        if(root == null){
            return count;
        }
        if(root.val == sum){
            count++;
        }
        count +=Core(root.right,sum-root.val);
        count +=Core(root.left,sum-root.val);
        count +=pathSum(root.right,sum);
        count +=pathSum(root.left,sum);

        return count;
    }
    public int Core(TreeNode root, int sum){
        int count =  0;
        if(root == null){
            return count;
        }
        if(root.val == sum){
            count++;
        }
        count+=Core(root.right,sum-root.val);
        count+=Core(root.left,sum-root.val);

        return count;
    }
}
