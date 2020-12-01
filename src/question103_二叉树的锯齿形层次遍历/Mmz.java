package question103_二叉树的锯齿形层次遍历;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/27 21:57
 * @Created by mmz
 */
public class Mmz {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        boolean flag = true;
        while(!linkedList.isEmpty()){
            int size = linkedList.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0;i<size;++i){
                TreeNode treeNode = linkedList.pollFirst();
                if(flag){
                    tmp.add(treeNode.val);
                }else {
                    tmp.add(treeNode.val);
                }
                if(treeNode.left != null){
                    linkedList.add(treeNode.left);
                }
                if(treeNode.right != null){
                    linkedList.add(treeNode.right);
                }
            }
            lists.add(tmp);
            flag = !flag;
        }

        return lists;
    }
}
