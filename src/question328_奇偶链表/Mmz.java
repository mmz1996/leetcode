package question328_奇偶链表;

import java.awt.*;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 19:20
 * @Created by mmz
 */
public class Mmz {
    static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode result  = head;
        ListNode first = result;
        ListNode second = result.next;
        ListNode resultsecond = second;

        while(first != null && second != null && second.next != null){
            first.next  = second.next;
            first = first.next;
            second.next = first.next;
            second = second.next;
        }
        first.next = resultsecond;
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Mmz mmz =new Mmz();
        mmz.oddEvenList(node1);
    }
}
