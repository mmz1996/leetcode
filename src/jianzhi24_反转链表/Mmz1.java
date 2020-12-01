package jianzhi24_反转链表;

import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/24 15:39
 * @Created by mmz
 */
public class Mmz1 {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode core(ListNode head){
        return coreReverse(head,null);
    }

    public ListNode coreReverse(ListNode head,ListNode pre){
        if(head == null){
            return pre;
        }

        ListNode next = head.next;
        head.next = pre;
        return coreReverse(next,head);
    }
}
