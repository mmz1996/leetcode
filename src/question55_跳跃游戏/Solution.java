package question55_跳跃游戏;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/13 14:00
 * @Created by mmz
 */
class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length<=0){
            return false;
        }
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 0;i<nums.length;++i){
            if(dp[i]){
                for(int j = 1;j<=nums[i];++j){
                    if((i+j) >= nums.length-1){
                        return true;
                    }
                    dp[i+j] = true;
                }
            }

        }
        return dp[dp.length-1] == true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.canJump(new int[]{2,0,0});
    }
}
