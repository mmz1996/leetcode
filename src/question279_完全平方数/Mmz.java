package question279_完全平方数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/27 22:57
 * @Created by mmz
 */
public class Mmz {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1;i<=n;++i){
            dp[i] = i;
            for(int j = 1;i-j*j>=0;j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
