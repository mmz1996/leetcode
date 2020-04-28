package question494;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/6 16:01
 * @Created by mmz
 */
public class Solution {
    public static int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        //求所有sum的总和，一是为了没有负数，最后求二维数组的第二位是[sum+s] 即可
        for(int num :nums){
            sum +=num;
        }
        if(Math.abs(sum) <Math.abs(S)){
            return 0;
        }
        int t = 2*sum+1;
        int[][] dp = new int[nums.length][t];
        if(nums[0] == 0){
            dp[0][sum] =2;
        }else{
            dp[0][sum+nums[0]] =1;
            dp[0][sum-nums[0]] =1;
        }

        for(int i =1;i<nums.length;++i){
            for(int j = 0;j<t;++j){
                int left = (j-nums[i])>=0?j-nums[i]:0;
                int right = (j+nums[i]<t)?j+nums[i]:0;
                dp[i][j] =dp[i-1][left]+dp[i-1][right];
            }
        }
        return dp[nums.length-1][sum+S];

    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
