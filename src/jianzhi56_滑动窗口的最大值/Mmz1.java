package jianzhi56_滑动窗口的最大值;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 13:09
 * @Created by mmz
 */
public class Mmz1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length<=0 || nums.length<k){
            return new int[0];
        }
        int[] result = new int[nums.length-k+1];
        int count= 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0;i<nums.length;++i){
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            queue.add(i);
            if(queue.peekFirst() <= i-k){
                queue.pollFirst();
            }

            if(i>=k-1){
                result[count++] =nums[queue.peekFirst()] ;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Mmz1 mmz1 = new Mmz1();
        System.out.println(mmz1.maxSlidingWindow(new int[]{7,2,4}, 2));
    }
}
