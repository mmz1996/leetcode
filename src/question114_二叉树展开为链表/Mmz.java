package question114_二叉树展开为链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/4 1:02
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }

    List<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Core(root);

        for(int i = 1;i<list.size();++i){
            TreeNode prev = list.get(i-1);
            TreeNode cur = list.get(i);
            prev.left = null;
            prev.right = cur;
        }
    }

    public void Core(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root);
        Core(root);
        Core(root);
    }
}
