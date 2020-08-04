package question144_二叉树的前序遍历;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/5 0:54
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> lists = new LinkedList<>();

        TreeNode node =root;
        while(node != null){
            if(node.left == null){
                lists.add(node.val);
                node = node.right;
            }else{
                TreeNode pre = node.left;
                while(pre.right != null && pre.right != node){
                    pre =pre.right;
                }

                if(pre.right == null){
                    lists.add(node.val);
                    pre.right = node;
                    node = node.left;
                }else{
                    pre.right = null;
                    node = node.right;
                }
            }
        }
        return lists;
    }
}
