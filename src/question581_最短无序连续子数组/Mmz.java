package question581_最短无序连续子数组;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 20:03
 * @Created by mmz
 */
public class Mmz {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length<=0){
            return 0;
        }
        int[] numnew = nums.clone();
        Arrays.sort(numnew);

        int start =nums.length-1;
        int end = 0;
        for(int i = 0;i<nums.length;++i){
            if(nums[i] != numnew[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }

        return end-start>=0?end-start+1:0;

    }
}
