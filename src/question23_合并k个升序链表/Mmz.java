package question23_合并k个升序链表;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/20 20:55
 * @Created by mmz
 */
public class Mmz {
    public class ListNode{
        int val;
        ListNode next= null;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists){
        int length = lists.length;
        ListNode result = new ListNode(0);
        ListNode pointer = result;

        while(true){
            ListNode now = null;
            int point = -1;

            for(int i = 0;i<length;++i){
                if(lists[i] == null){
                    continue;
                }
                if(now == null || lists[i].val < now.val){
                    now = lists[i];
                    point = i;
                }
            }
            if (point == -1){
                break;
            }
            pointer.next = now;
            pointer = pointer.next;
            lists[point] = lists[point].next;
        }
        return result.next;
    }
}
