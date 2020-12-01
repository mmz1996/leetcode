package question62_不同路径;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/13 16:41
 * @Created by mmz
 */
class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length <=0 || grid[0].length <=0){
            return 0;
        }
        int length = grid[0].length;
        int[] dp = new int[length];
        for(int i = 0;i<grid.length;++i){
            for(int j = 0;j<grid[0].length;++j){
                if(i == 0 && j == 0){
                    dp[j] = grid[0][0];
                }else if(i == 0){
                    dp[j] = dp[j-1]+grid[i][j];
                }else if(j == 0){
                    dp[j] +=grid[i][j];
                }else{
                    dp[j] = Math.min(dp[j],dp[j-1])+grid[i][j];
                }
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
    }
}
