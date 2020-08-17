package jianzhi06_从尾到头打印链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:36
 * @Created by mmz
 */
public class Mmz {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  List<Integer> list = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
       if(head == null){
           return  new int[0];
       }
       Core(head);
       int[] result = new int[list.size()];
       for(int i = 0 ;i<list.size();++i){
           result[i] = list.get(i);
       }
       return result;
    }
    public void Core(ListNode head){
        if(head == null){
            return ;
        }
        Core(head.next);
        list.add(head.val);
    }
}
