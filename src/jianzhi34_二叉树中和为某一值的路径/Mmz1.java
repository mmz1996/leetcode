package jianzhi34_二叉树中和为某一值的路径;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 18:14
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
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return lists;
        }
        core(root,sum,new ArrayList<>());
        return lists;
    }

    public void core(TreeNode root,int sum ,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        sum = sum-root.val;
        if(sum == 0 && root.left ==null && root.right == null){
            lists.add(new ArrayList<>(list));
        }
        core(root.left,sum,list);
        core(root.right,sum,list);
        list.remove(list.size()-1);
    }
}
