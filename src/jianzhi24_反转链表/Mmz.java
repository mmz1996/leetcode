package jianzhi24_反转链表;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 1:42
 * @Created by mmz
 */
public class Mmz {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre =head;
            head = next;
        }
        return pre;
    }
}
