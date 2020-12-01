package question64_最小路径和;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 1:08
 * @Created by mmz
 */
public class Mmz {
    public int minPathSum(int[][] grid) {
        int row = grid.length-1;
        int cols = grid[0].length-1;
        int[] result = new int[cols+1];
        for(int i = 0;i<=row;++i){
            for(int j = 0;j<=cols;++j){
                if(i ==0 && j ==0){
                    result[j] = grid[i][j];
                }else if(j==0){
                    result[j] = result[j]+grid[i][j];
                }else if(i == 0){

                    result[j] = result[j-1]+grid[i][j];
                }else{
                    result[j] = Math.min(result[j]+grid[i][j],result[j-1]+grid[i][j]);
                }
            }
        }
        return result[cols-1];
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
    }
}
