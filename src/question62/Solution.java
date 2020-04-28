package question62;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/9 15:25
 * @Created by mmz
 */
public class Solution {
    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0;i<n;++i){
            dp[0][i] = 1;
        }
        for(int j = 0;j<n;++j){
            dp[j][0] = 1;
        }
        for(int j=1;j<m;++j){
            for(int i = 1;i<n;++i){
                dp[j][i] = dp[j-1][i]+ dp[j][i-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }
}
