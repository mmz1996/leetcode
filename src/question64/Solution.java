package question64;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/9 15:09
 * @Created by mmz
 */
public class Solution {
    public static int minPathSum(int[][] grid) {
        int[] dp = new int[grid[0].length];

        for(int i = 0;i<grid.length;++i){
            for(int j = 0;j<grid[0].length;++j){
                if(j == 0 && i == 0){
                    dp[j] = grid[i][j];
                }else if(j == 0 && i != 0){
                    dp[j] = dp[j]+grid[i][j];
                }else if(j != 0 && i == 0){
                    dp[j] = grid[i][j];
                }else{
                    dp[j] = Math.min(dp[j]+grid[i][j],dp[j-1]+grid[i][j]);
                }
            }
        }
        return dp[grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] arr= new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        minPathSum(arr);
    }
}
