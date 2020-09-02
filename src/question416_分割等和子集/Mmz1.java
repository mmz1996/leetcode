package question416_分割等和子集;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/3 0:11
 * @Created by mmz
 */
public class Mmz1 {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length<=0){
            return false;
        }

        int sum = 0;
        for(int num:nums){
            sum +=num;
        }

        if(sum %2 ==1){
            return false;
        }
        int length = nums.length;
        int target = sum/2;

        boolean[][] dp = new boolean[length][target+1];
        if(nums[0] <= target){
            dp[0][nums[0]] = true;
        }

        for(int i = 1;i<length;++i){
            for(int j =0;j<=target;++j){
                if(nums[i] == j){
                    dp[i][j] =true;
                    continue;
                }

                if(nums[i] <j){
                    dp[i][j] = dp[i-1][j] ||dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[length-1][target];
    }
}
