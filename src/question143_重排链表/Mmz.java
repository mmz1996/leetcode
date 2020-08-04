package question143_重排链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/5 0:18
 * @Created by mmz
 */
public class Mmz {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

   static public void reorderList(ListNode head) {
        List<ListNode> lists = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            lists.add(cur);
            cur = cur.next;
        }
        int i = 0 ;
        int j = lists.size()-1;
        Core(i,j,lists);
    }
    static ListNode Core(int i,int j ,List<ListNode> list){
        if(i>=j){
            return null;
        }
        ListNode now = list.get(i);
        ListNode next =list.get(j);
        now.next = next;
        next.next = Core(i+1,j-1,list);
        return now ;
    }

    public static void main(String[] args) {
        ListNode listNode  = new ListNode(1);
        ListNode listNode2  = new ListNode(2);
        ListNode listNode3  = new ListNode(3);
        ListNode listNode4  = new ListNode(4);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next =null;
        reorderList(listNode);
    }
}
