package jianzhi22_链表中倒数第k个节点;

import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 1:57
 * @Created by mmz
 */
public class Mmz {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;

        ListNode first = pre;
        ListNode second =pre;
        while(k != 0){
            if(first == null){
                return null;
            }
            first = first.next;
            k--;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
