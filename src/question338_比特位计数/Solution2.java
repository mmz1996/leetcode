package question338_比特位计数;

/**
 * @Classname Solution2
 * @Description TODO
 * @Date 2020/4/13 13:23
 * @Created by mmz
 */
public class Solution2 {
    public static   int[] countBits(int num) {
        int[] dp = new int[num+1];
        for(int i = 0;i<num+1;++i){
            dp[i] = dp[i>>1]+(i&1);
        }
        return dp;
    }
}
