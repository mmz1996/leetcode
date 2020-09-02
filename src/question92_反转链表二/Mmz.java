package question92_反转链表二;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/22 16:03
 * @Created by mmz
 */
public class Mmz {
    public class ListNode{
        int val;
        ListNode next =null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == 1){
            return reversN(head,n);
        }else{
            return reverseBetween(head,m-1,n-1);
        }

    }

    ListNode successor = null;
    public ListNode reversN(ListNode head,int n){
        if(n == 1){
            successor = head.next;
            return head;
        }

        ListNode last = reversN(head.next,n-1);

        head.next.next = head;
        head.next = successor;
        return last;
    }
}
