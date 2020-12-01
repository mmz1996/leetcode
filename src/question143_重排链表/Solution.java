package question143_重排链表;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/15 17:38
 * @Created by mmz
 *//**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val ,ListNode next){
        this.val = val;
        this.next = next;
    }
}
class Solution {

    public void reorderList(ListNode head) {
        if(head == null){
            return ;
        }
        ListNode first = head;
        ListNode last = head;
        while(last  != null && last.next != null){
            first = first.next;
            last = last.next.next;;
        }
        ListNode newHead = first.next;
        first.next = null;

        ListNode newnode = reverse(newHead);

        ListNode result = head;
        while(newnode != null){
            ListNode temp  = newnode.next;
            newnode.next = head.next;
            head.next = newnode;
            head = newnode.next;
            newnode = temp;
        }

    }
    ListNode pre = null;
    public ListNode reverse(ListNode head){
        if(head == null){
            return pre;
        }
        ListNode next = head.next;
        head.next = pre;
        pre = head;
        head = next;

        return reverse(head);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        solution.reorderList(node1);
    }
}
