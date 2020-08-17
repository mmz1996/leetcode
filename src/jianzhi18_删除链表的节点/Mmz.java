package jianzhi18_删除链表的节点;

import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 1:37
 * @Created by mmz
 */
public class Mmz {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }

        ListNode pre  = new ListNode(-1);
        ListNode result = pre;
        pre.next = head;
        while(head.val != val && head.next !=null){
            head= head.next;
            pre = pre.next;
        }
        pre.next = head.next;
        return result.next;

    }
}
