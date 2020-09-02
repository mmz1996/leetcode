package question23_合并k个升序链表;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Classname Mmz3
 * @Description TODO
 * @Date 2020/8/21 22:44
 * @Created by mmz
 */
public class Mmz3 {
    public class ListNode{
        int val;
        ListNode next= null;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length <=0){
            return null;
        }

        Queue<ListNode> queue = new PriorityQueue<>(
                (o1, o2) -> o1.val-o2.val
        );


        for(ListNode listNode :lists){
            if(listNode != null){
                queue.offer(listNode);
            }
        }
        ListNode head = new ListNode(-1);
        ListNode next = head;

        while(!queue.isEmpty()){
            ListNode listNode = queue.poll();
            next.next =listNode;
            next = next.next;

            if(listNode.next != null){
                listNode = listNode.next;
                queue.offer(listNode);
            }
        }

        return head.next;
    }
}
