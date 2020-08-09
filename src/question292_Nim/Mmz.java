package question292_Nim;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 2:06
 * @Created by mmz
 */
public class Mmz {
    public boolean canWinNim(int n) {
        boolean[] dp = new boolean[n+1];
        if(n <=3){
            return true;
        }
        dp[0] = true;
        dp[1] = true;
        dp[2] = true;
        dp[3] = true;

        for(int i = 4;i<=n;++i){
            dp[i] = false;
            for(int j = i-3;j<i;j++){
                if(dp[j] == false){
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }
}
