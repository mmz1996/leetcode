package question560_和为k的子数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 20:21
 * @Created by mmz
 */
public class Mmz {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;++i){
            int sum = 0;
            for(int j= i;j>=0;j--){
                sum +=nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
