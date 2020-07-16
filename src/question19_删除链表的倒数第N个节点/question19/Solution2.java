package question19_删除链表的倒数第N个节点.question19;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/7/17 0:28
 * @Created by mmz
 */
public class Solution2 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode target = pre;
        ListNode first = pre;
        ListNode second = pre;
        while(n  != 0){
            second =second.next;
            n--;
        }
        while(second.next!=null){
            second = second.next;
            first =first.next;
        }
        first.next = first.next.next;
        return target.next;
    }
}
