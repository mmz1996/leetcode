package jianzhi14_剪绳子;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 0:01
 * @Created by mmz
 */
public class Mmz {
    public int cuttingRope(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4;i<=n;++i){
            for(int j = 1;j<=i/2;++j){
                dp[i] = Math.max(dp[i],dp[i-j]*dp[j]);
            }
        }
        return dp[n];
    }
}
