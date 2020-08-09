package jianzhi54_二叉搜索树的第k大节点;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 19:01
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
    List<Integer> list =new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        if(root == null || k <=0){
            return -1;
        }

        Core(root);
        return list.get(k-1);
    }
    public void Core(TreeNode root){
        if(root == null){
            return;
        }
        Core(root.left);
        list.add(root.val);
        Core(root.right);
    }
}
