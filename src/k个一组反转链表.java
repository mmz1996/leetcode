/**
 * Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode begin = dummyNode.next;
        ListNode end = null;
        ListNode pNext = null;
        while(begin != null){
            end = begin;
            //找到begin开始第k个节点(1)
            for(int i = 1;i<k;i++){
                if(end.next != null){
                    end = end.next;
                }else{//剩余节点个数小于k
                    return dummyNode.next;
                }
            }
            pNext = end.next;//(2)操作前先保存后续节点
            end.next = null;//(3)隔离一个子链表
            pre.next = reverseList(begin);//(4)(5)翻转子链表
            begin.next = pNext;//(6)连接
            //后移操作
            pre = begin;//(7)
            begin = pNext;//(8)
        }
        return dummyNode.next;
    }
    //对不带头节点的单链表翻转
    public ListNode reverseList(ListNode head) {
        //排除空表和单节点情况
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = null;
        ListNode next = null;

        cur = head;
        next = cur.next;
        //设置链表第一个节点为尾节点
        cur.next = null;

        pre = cur;
        cur = next;
        //使当前遍历到的节点cur指向其前驱节点
        while (cur.next != null) {
            //操作前保存后面的节点
            next = cur.next;
            //反转两个节点操作
            cur.next = pre;
            //指针后移
            pre = cur;
            cur = next;
        }
        //最后一个节点指向倒数第二个节点
        cur.next = pre;
        //链表的头节点指向原来链表的尾节点
        head = cur;
        return head;
    }
}
