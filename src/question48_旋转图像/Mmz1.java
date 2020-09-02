package question48_旋转图像;

import com.sun.org.apache.bcel.internal.generic.LNEG;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 10:06
 * @Created by mmz
 */
public class Mmz1 {
    public void rotate(int[][] matrix) {
        int length = matrix.length;

        for(int i = 0;i<length;++i){
            for(int j = i;j<length;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0;i<length;++i){
            for(int j = 0;j<length/2;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j-1];
                matrix[i][length-j-1] = temp;
            }
        }


    }
}
