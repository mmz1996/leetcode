package question94_二叉树的中序遍历;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/22 16:49
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root ==null){
            return list;
        }

        core(root);

        return list;
    }

    public void core(TreeNode root){
        if(root == null){
            return ;
        }
        core(root.left);
        list.add(root.val);
        core(root.right);
    }
}
