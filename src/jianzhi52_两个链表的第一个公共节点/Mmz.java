package jianzhi52_两个链表的第一个公共节点;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 21:04
 * @Created by mmz
 */
public class Mmz {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode counta = headA;
        int countA = 0;
        ListNode countb = headB;
        int countB = 0;
        while(counta != null){
            countA++;
            counta = counta.next;
        }

        while(countb != null){
            countB++;
            countb = countb.next;
        }

        if(countB > countA){
            while(countB -countA != 0){
                headB = headB.next;
                countB--;
            }
        }else{
            while(countA-countB != 0){
                headA = headA.next;
                countA--;
            }
        }

        while(headA != headB){
            if(headA == null || headB == null){
                return null;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
