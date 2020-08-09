package question334_递增的三元子序列;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 19:31
 * @Created by mmz
 */
public class Mmz {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
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
        for(int i = 0;i<nums.length;++i){
            if(dp[i] >=3){
                return true;
            }
        }
        return false;
    }
}
