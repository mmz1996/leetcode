package jianzhi56_滑动窗口的最大值;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/1 14:59
 * @Created by mmz
 */
public class Mmz2 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums == null || nums.length<=0|| nums.length<k){
            return new int[0];
        }
        int[] result = new int[nums.length-k+1];


        for(int i = 0 ;i<result.length;++i){
            int max = Integer.MIN_VALUE;
            for(int j = i;j<i+k;++j){
                if(nums[j] >max){
                    max = nums[j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}
