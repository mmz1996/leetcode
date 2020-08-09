package question240_搜索二维矩阵;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/7 22:46
 * @Created by mmz
 */
public class Mmz {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rows = matrix.length;
        int row = 0;
        int cols = matrix[0].length;
        int col = matrix[0].length-1;

        while(row >=0 && row <rows && col >=0 && col <cols){
            int temp = matrix[row][col];
            if(target ==temp){
                return true;
            }else if(target < temp){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
