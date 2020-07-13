package question198_打家劫舍;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 19:56
 * @Created by mmz
 */
public class Solution {
    public int rob(int[] nums) {
        int max = 0 ,pre = 0;
        for(int i = 0 ;i<nums.length;++i){
            int temp = max;
            max = Math.max(pre+nums[i],temp);
            pre =temp;
        }
        return max;
    }
}
