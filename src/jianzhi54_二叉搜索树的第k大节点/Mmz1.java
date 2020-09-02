package jianzhi54_二叉搜索树的第k大节点;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 16:37
 * @Created by mmz
 */
public class Mmz1 {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int val){
            this.val = val;
        }
    }
    int k,res;
    public int kthLargest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        this.k = k;
        core(root);
        return res;

    }

    public void core(TreeNode root){
        if(root == null){
            return ;
        }
        core(root.right);
        if(k == 0){
            return ;
        }
        if(--k == 0){
            res = root.val;
        }
        core(root.left);
    }
}
