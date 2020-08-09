package question234_回文链表;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/7 1:04
 * @Created by mmz
 */
public class Mmz {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {
        StringBuffer string = new StringBuffer();
        while(head != null){
            string.append(head.val);
            head = head.next;
        }
        System.out.println(string);
        System.out.println(string.reverse());
        return string == string.reverse();
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;
        System.out.println(mmz.isPalindrome(listNode));
    }
}
