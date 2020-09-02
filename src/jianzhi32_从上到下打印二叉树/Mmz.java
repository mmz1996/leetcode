package jianzhi32_从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/1 22:24
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
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        List<Integer> lists = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();

        linkedList.addLast(root);
        
        while(!linkedList.isEmpty()){
            TreeNode treeNode = linkedList.pollFirst();
            lists.add(treeNode.val);
            if(treeNode.left != null){
                linkedList.addLast(treeNode.left);
            }
            if(treeNode.right != null){
                linkedList.addLast(treeNode.right);
            }
        }

        int[] result = new int[lists.size()];
        for(int i = 0;i<result.length;++i){
            result[i] = lists.get(i);
        }

        return result;

    }
}
