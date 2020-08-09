package jianzhi34_二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/10 0:21
 * @Created by mmz
 */
public class Mmz {
    public static class TreeNode {
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
        Core(root,sum,new ArrayList<>());
        return lists;
    }

    public void Core(TreeNode root ,int sum ,List<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        sum = sum-root.val;
        if(sum == 0 && root.left == null && root.right == null){
            lists.add(new ArrayList<>(list));
        }
        Core(root.left,sum,list);
        Core(root.right,sum,list);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right =node6;
        node4.left =node7;
        node4.right = node8;
        node6.left = node9;
        node6.right = node10;

        Mmz mmz = new Mmz();
        mmz.pathSum(node1,22);
    }
}
