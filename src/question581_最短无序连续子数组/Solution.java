package question581_最短无序连续子数组;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/13 22:20
 * @Created by mmz
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] newnums = nums.clone();
        Arrays.sort(newnums);
        int start = nums.length,end = 0;
        for(int i = 0 ;i<nums.length;++i){
            if(nums[i] != newnums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        return end-start>=0? end-start+1:0;
    }
}