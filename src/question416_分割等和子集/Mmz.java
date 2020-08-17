package question416_分割等和子集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 16:35
 * @Created by mmz
 */
public class Mmz {
    public static boolean canPartition(int[] nums) {
       int len = nums.length;
       if(len == 0){
           return false;
       }
       int sum = 0;
       for(int num:nums){
           sum +=num;
       }
       if((sum & 1) ==1){
           return false;
       }
       int target = sum/2;

       boolean[][] dp = new boolean[len][target+1];

       if(nums[0] <= target){
           dp[0][nums[0]] =true;
       }

       for(int i = 1;i<len;++i){
           for(int j = 0;j<=target ;++j){
               dp[i][j] = dp[i-1][j];
               if(nums[i] == j){
                   dp[i][j] = true;
                   continue;
               }

               if(nums[i] < j){
                   dp[i][j] = dp[i-1][j] ||dp[i-1][j-nums[i]];
               }
           }
       }
       return dp[len-1][target];
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{23, 13, 11, 7, 6, 5, 5}));
    }
}
