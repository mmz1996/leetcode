package question61_旋转链表;

import java.lang.annotation.Target;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 21:51
 * @Created by mmz
 */
public class Mmz {
    public class ListNode{
        int val = 0;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }


    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode old = head;
        int n ;
        for(n =1;old.next != null;n++){
            old = old.next;
        }
        old.next = head;

        ListNode newnode = head;
        for(int i =0 ;i<n-k % n-1;++i){
            newnode = newnode.next;
        }

        ListNode newhead =newnode.next;
        newnode.next = null;

        return newhead;
    }

}
