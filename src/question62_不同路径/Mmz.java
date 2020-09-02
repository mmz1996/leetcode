package question62_不同路径;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 22:29
 * @Created by mmz
 */
public class Mmz {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];

        for(int i = 0;i<m;++i){
            for(int j = 0;j<n;++j){
                if(i == 0){
                    dp[j] = 1;
                }else if(j == 0 && i != 0){
                    continue;
                }else{
                    dp[j] = dp[j]+dp[j-1];
                }
            }
        }

        return dp[dp.length-1];
    }
}
