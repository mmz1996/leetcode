package question109_有序链表转换成二叉树;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/4 0:29
 * @Created by mmz
 */
public class Mmz {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] newint = new int[list.size()];
        for(int i =0 ;i<list.size();++i){
            newint[i] = list.get(i);
        }

        return Core(newint,0,newint.length-1);
    }

    public TreeNode Core(int[] num,int left,int right){
        if(left>right){
            return null;
        }

        int mid = (left+right)/2;

        TreeNode root = new TreeNode(num[mid]);
        root.left = Core(num,left,mid-1);
        root.right= Core(num,mid+1,right);
        return root;

    }

}
