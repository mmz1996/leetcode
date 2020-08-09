package question200_岛屿数量;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/6 1:59
 * @Created by mmz
 */
public class Mmz {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int count = 0;
        for(int i = 0;i<row;++i){
            for(int j = 0;j<col;++j){
                if(grid[i][j] == '1'){
                    Core(i,j,row,col,grid);
                    count++;
                }
            }

        }
        return count;
    }

    public void Core(int i,int j ,int row,int col,char[][] grid){
        if(i >=0 && i<row && j>=0 && j<col && grid[i][j] == '1'){
            grid[i][j] = '0';
            Core(i+1,j,row,col,grid);
            Core(i-1,j,row,col,grid);
            Core(i,j+1,row,col,grid);
            Core(i,j-1,row,col,grid);
        }
    }

    public static void main(String[] args) {
        Mmz mmz =new Mmz();
        mmz.numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}});
    }
}
