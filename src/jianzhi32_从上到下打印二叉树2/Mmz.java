package jianzhi32_从上到下打印二叉树2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/2 17:42
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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();

        if(root == null){
            return lists;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addLast(root);
        LinkedList<TreeNode> last = new LinkedList<>();
        while(!linkedList.isEmpty()){
            List<Integer> list = new ArrayList<>();
           while(!linkedList.isEmpty()){
               TreeNode treeNode = linkedList.pollFirst();
               list.add(treeNode.val);
               last.addLast(treeNode);
           }
           while(!last.isEmpty()){
               TreeNode treeNode = last.pollFirst();
               if(treeNode.left != null){
                   linkedList.add(treeNode.left);
               }

               if(treeNode.right != null){
                   linkedList.add(treeNode.right);
               }
           }
           lists.add(list);
        }

        return lists;

    }
}
