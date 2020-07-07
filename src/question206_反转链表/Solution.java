package question206_反转链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/7 22:42
 * @Created by mmz
 */
public class Solution {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
