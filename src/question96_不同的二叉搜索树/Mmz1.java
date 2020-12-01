package question96_不同的二叉搜索树;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/27 21:32
 * @Created by mmz
 */
public class Mmz1 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i =2;i<=n;++i){
            for(int j =1;j<=i;++j){
                dp[i] +=dp[j-1] * dp[i-j];
            }
        }

        return dp[n];
    }
}
