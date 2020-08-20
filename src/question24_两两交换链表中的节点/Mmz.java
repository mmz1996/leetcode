package question24_两两交换链表中的节点;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/20 21:49
 * @Created by mmz
 */
public class Mmz {
    public class ListNode{
        int val ;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }
}
