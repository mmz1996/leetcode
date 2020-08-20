package question23_合并k个升序链表;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/8/20 21:30
 * @Created by mmz
 */
public class Mmz2 {
    public class ListNode{
        int val;
        ListNode next= null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode merge2Lists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge2Lists(l1.next, l2);
            return l1;
        }
        l2.next = merge2Lists(l1, l2.next);
        return l2;
    }

    public ListNode mergeKLists(ListNode[] lists){
        ListNode res = null;
        for(ListNode listNode:lists){
            res = merge2Lists(res,listNode);
        }
        return res;
    }



}
