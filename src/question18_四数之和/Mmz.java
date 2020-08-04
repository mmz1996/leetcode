/*
package question18_四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

*/
/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/31 0:19
 * @Created by mmz
 *//*

public class Mmz {
    public List<List<Integer>> fourSum(int[] nums,int target){
        if(nums == null || nums.length<4){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int length = nums.length;

        for(int k = 0 ;k<length-3;++k){
            if(k>0 && nums[k] == nums[k-1]){
                continue;
            }

            int min1 = nums[k] + nums[k+1] + nums[k+2]+nums[k+3];
            if(min1>target){
                break;
            }
            int max1 = nums[k] +nums[length-1]+ nums[length-2]+nums[length-3];
            if(max1<target){
                continue;
            }


        }
    }
}
*/
