import java.util.Arrays;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/8/1 20:27
 * @Created by mmz
 */
public class test {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || head.next == null) {
                return null;
            }

            ListNode dumy = new ListNode(-1);
            dumy.next = head;
            ListNode pre = dumy;
            ListNode begin = head;
            ListNode end = null;
            ListNode pNext = null;

            while(begin != null){
                end = begin;
                for(int i = 1;i<k;++i){
                    if(end.next != null){
                        end = end.next;
                    }else{
                        return dumy.next;
                    }
                }

                pNext = end.next;
                end.next = null;
                pre.next = reverseList(begin);
                begin.next = pNext;

                pre = begin;
                begin = pNext;
            }

            return dumy.next;
        }

        public ListNode reverseList(ListNode head){
            if(head == null || head.next == null){
                return head;
            }

            ListNode pre = null;
            ListNode now = head;
            return head;
        }

    }
}
