import question23_合并k个升序链表.Mmz;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/18 14:23
 * @Created by mmz
 */
public class Main {
    public static class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }

    public static   ListNode mergerM(ListNode[] lists){
        int length = lists.length;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(
                new Comparator<ListNode>() {
                    @Override
                    public int compare(ListNode o1, ListNode o2) {
                        return o1.val-o2.val;
                    }
                }
        );

        for(ListNode listNode:lists){
            if(listNode != null){
                priorityQueue.add(listNode);
            }
        }

        ListNode result  = new ListNode(-1);
        ListNode pre =result;
        while(!priorityQueue.isEmpty()){
            ListNode temp = priorityQueue.poll();
            if(temp.next != null){
                priorityQueue.add(temp.next);
            }
            ListNode newNode = new ListNode(temp.val);
            result.next = newNode;
            result = newNode;
        }

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        ListNode listNode3 = new ListNode(3);

        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode3.next = listNode4;

        ListNode[] listNodes = new ListNode[2];
        listNodes[0] = listNode1;
        listNodes[1] = listNode3;

        ListNode listNode = mergerM(listNodes);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode= listNode.next;
        }

    }

}
