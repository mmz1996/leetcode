package jianzhi47_礼物的最大值;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 20:57
 * @Created by mmz
 */
public class Mmz {
    public int maxValue(int[][] grid) {
        int[] dp = new int[grid[0].length];
        dp[0] = grid[0][0];
        for(int i = 1;i<dp.length;++i){
            dp[i] = grid[0][i]+dp[i-1];
        }

        for(int i = 1;i<grid.length;++i){
            for(int j = 0;j<dp.length;++j){
                if(j == 0){
                    dp[j] = dp[j]+grid[i][j];
                }else{
                    dp[j] = Math.max(dp[j]+grid[i][j],dp[j-1]+grid[i][j]);
                }
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {

        Mmz mmz = new Mmz();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        mmz.maxValue(grid);
    }
}
