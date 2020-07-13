package question234_回文链表;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 20:24
 * @Created by mmz
 */
public class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<>();
        while(head != null){
            array.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = array.size()-1;
        while(i<j){
            if((int)array.get(i) != (int)array.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
