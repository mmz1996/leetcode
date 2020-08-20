package question23_合并k个升序链表;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/20 21:07
 * @Created by mmz
 */
public class Mmz1 {
    public class ListNode{
        int val;
        ListNode next= null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists){
      Queue<ListNode> queue = new PriorityQueue<>(
              (o1, o2) -> o1.val - o2.val
      );

      for(ListNode listNode :lists){
          if(listNode != null){
              queue.offer(listNode);
          }
      }

      ListNode head = new ListNode(0);
      ListNode point = head;

      while(!queue.isEmpty()){
          ListNode listNode = queue.poll();
          point.next = listNode;
          point = point.next;
          if(listNode.next != null){
              queue.offer(listNode.next);
          }
      }

      return head.next;
    }
}
