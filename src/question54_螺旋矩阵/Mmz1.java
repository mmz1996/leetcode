package question54_螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 10:53
 * @Created by mmz
 */
public class Mmz1 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length<=0 || matrix[0].length<=0){
            return list;
        }

        int top = 0 ;
        int left = 0;
        int bot = matrix.length-1;
        int right = matrix[0].length-1;

        while(left<=right && top<=bot){
            for(int i = left;i<matrix[0].length;++i){
                list.add(matrix[top][i]);
            }

            for(int i = top+1;i<matrix.length;++i){
                list.add(matrix[i][right]);
            }

            if(left<right && top<bot){
                for(int i = right-1;i>left;i--){
                    list.add(matrix[bot][i]);
                }

                for(int i = bot;i>top;i--){
                    list.add(matrix[i][left]);
                }
            }

            left++;
            right--;
            top++;
            bot--;
        }
        return  list;
    }

    public static void main(String[] args) {
        Mmz1 mmz1 = new Mmz1();
        System.out.println(mmz1.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }
}
