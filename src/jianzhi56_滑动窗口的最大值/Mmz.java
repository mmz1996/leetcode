package jianzhi56_滑动窗口的最大值;

import java.util.LinkedList;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 18:03
 * @Created by mmz
 */
public class Mmz {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length <=0 ||k <1){
            return new int[0];
        }
        int[] result = new int[nums.length-k+1];
        int index = 0;
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0;i<nums.length;++i){
            while(!list.isEmpty() && nums[list.peekLast()] <= nums[i]){
                list.pollLast();
            }

            list.addLast(i);

            if(list.peekFirst() == (i-k)){
                list.pollFirst();
            }

            if(i-k+1>=0){
                result[index++] = nums[list.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        int result[] = new int[]{1,3,-1,-3,5,3,6,7};
        mmz.maxSlidingWindow(result,3);
    }
}
