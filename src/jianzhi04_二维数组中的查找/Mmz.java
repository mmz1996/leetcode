package jianzhi04_二维数组中的查找;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:21
 * @Created by mmz
 */
public class Mmz {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length<=0 || matrix[0].length<=0){
            return false;
        }
        int row = 0;
        int rows = matrix.length;
        int col = matrix[0].length-1;
        while (row <rows && col >=0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
