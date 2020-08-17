package question2_两数相加;

import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/17 21:39
 * @Created by mmz
 */
public class Mmz {
    class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1,q=l2;
        ListNode pre = new ListNode(-1);
        ListNode result = pre;
        int flag = 0;
        while(p != null || q!=null){
            int val1 = p==null?0:p.val;
            int val2 = q==null?0:q.val;

            int temp = flag+val1+val2;
            ListNode now = new ListNode(temp%10);
            flag = temp/10;

            pre.next = now;
            pre =pre.next;

            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }

        if(flag == 1){
            ListNode last = new ListNode(1);
            pre.next = last;
        }

        return result.next;
    }
}
