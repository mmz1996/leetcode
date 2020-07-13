package question141_环形链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 19:28
 * @Created by mmz
 */
public class Solution {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode first = head,second = head.next;
        while(first != second){
            if(second == null || second.next == null){
                return false;
            }
            first = first.next;
            second = second.next.next;
        }
        return true;
    }
}
