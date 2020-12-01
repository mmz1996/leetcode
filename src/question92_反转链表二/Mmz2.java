package question92_反转链表二;

import sun.security.jgss.GSSHeader;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/27 21:14
 * @Created by mmz
 */
public class Mmz2 {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    ListNode last = null;
    public ListNode reverse(ListNode head,int n){
       if(n == 1){
           last = head.next;
           return head;
       }

       ListNode listNode = reverse(head.next,n-1);

       head.next.next = head;
       head.next = last;
       return listNode;
    }
}
