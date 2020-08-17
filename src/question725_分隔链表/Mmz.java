package question725_分隔链表;

import java.util.Currency;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 15:28
 * @Created by mmz
 */
public class Mmz {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode nownode = root;
        int count = 0;
        while(nownode != null){
            count++;
            nownode = nownode.next;
        }
        int counts = count/k;
        int countsyu = count%k;
        ListNode[] listNodes = new ListNode[k];
        nownode = root;
        for(int i = 0;i<k;++i){
            ListNode head = nownode;
            for(int j = 0;j<counts+(i<countsyu?1:0)-1;++j){
                if(nownode != null){
                    nownode = nownode.next;
                }
            }
            if(nownode != null){
                ListNode prev =nownode;
                nownode = nownode.next;
                prev.next = null;
            }
            listNodes[i]=head;
        }
        return listNodes;

    }
}
