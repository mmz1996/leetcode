package question300_最长上升序列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 2:08
 * @Created by mmz
 */
public class Mmz {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1;i<nums.length;++i){
            dp[i] = 1;
            for(int j = 0;j<i;++j){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 0;
        for(int i = 0 ;i<nums.length;++i){
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
