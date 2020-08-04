package question54_螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 17:17
 * @Created by mmz
 */
public class Mmz {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lists = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0){
            return lists;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = cols-1;
        int top = 0;
        int bottom = rows-1;

        while(left<=right && top<=bottom){
            for(int i = left;i<=right ;++i){
                lists.add(matrix[top][i]);
            }
            for(int j = top+1;j<=bottom;++j){
                lists.add(matrix[j][right]);
            }

            if(left<right && top<bottom){
                for(int i =right-1;i>left;i--){
                    lists.add(matrix[bottom][i]);
                }
                for(int i = bottom;i>top;--i){
                    lists.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return lists;
    }
}
