package question55_跳跃游戏;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 14:34
 * @Created by mmz
 */
public class Mmz1 {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length+1];
        dp[0] = true;

        for(int i = 0;i<nums.length;++i){
            int k = nums[i];
            if(dp[i]){
                for(int j = 1; j<=k;++j){
                    if(i+j<dp.length){
                        dp[i+j] = true;
                    }
                }
            }
        }

        return dp[dp.length-1];
    }
}
