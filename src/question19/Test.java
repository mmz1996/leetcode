package question19;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/4/2 4:50
 * @Created by mmz
 */
public class Test {
    static class ListNode{
        int val ;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode4 = null;
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next =listNode2;
        listNode2.next =listNode3;
        listNode3.next = listNode4;
        System.out.println(listNode2.next == listNode3);
        listNode3  = listNode4;
        System.out.println(listNode2.next == listNode3);
    }
}
