package question538_把二叉搜索树转换成累加树;

import java.util.List;
import java.util.PriorityQueue;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/2 23:51
 * @Created by mmz
 */
public class Mmz1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root != null){
            convertBST(root.right);
            sum +=root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

    public class senlin{
        int val;
        List<senlin> list;
        int size;
        senlin(int val,int size){
            this.val = val;
            this.size =size;
        }
    }
}
