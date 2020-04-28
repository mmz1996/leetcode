package question19;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/2 4:16
 * @Created by mmz
 */
public class Solution {
    public static class ListNode {
     int val;
    ListNode next;
      ListNode(int x) { val = x; }
 }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode target = new ListNode(-1);
        target.next = head;
        ListNode first =head;
        ListNode second = head;
        System.out.println(second == target);
        int length = n-1;
        while(length != 0){
            first = first.next;
            length--;
        }
        System.out.println(second == target);
        while(first.next != null){
            first= first.next;
            second = second.next;
        }
        System.out.println(second == target);
        if(second.next ==null){
            second = null;
            System.out.println(second == target);
        }else{
            second.val = second.next.val;
            second.next = second.next.next;
        }
        return target.next;
    }

    public static void main(String[] args) {
        ListNode listNode =new ListNode(1);
        ListNode listNode1 = removeNthFromEnd(listNode,1);
        System.out.println(listNode1);
    }
}
