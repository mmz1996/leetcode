package question19_删除链表的倒数第N个节点;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 23:39
 * @Created by mmz
 */
public class Mmz {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode returnnode = pre;
        ListNode first = head;
        int length = 0 ;
        while(first != null){
            length++;
            first = first.next;
        }
        length = length-n;
        while(length !=0){
            pre =pre.next;
            length--;
        }
        pre.next = pre.next.next;

        return returnnode.next;
    }
}
