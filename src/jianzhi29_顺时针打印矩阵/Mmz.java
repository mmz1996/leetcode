package jianzhi29_顺时针打印矩阵;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 2:04
 * @Created by mmz
 */
public class Mmz {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0|| matrix[0].length ==0){
            return new int[0];
        }
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int result[] = new int[(right+1)*(bottom+1)];
        int index = 0;
        while(left<=right && top<=bottom){

            for(int i = left ;i<=right;++i){
                result[index++] = matrix[top][i];
            }

            for(int i = top+1;i<=bottom;++i){
                result[index++] = matrix[i][right];
            }

            if(left<right && top <bottom){
                for(int i = right-1;i>=left;--i){
                    result[index++] = matrix[bottom][i];
                }

                for(int i = bottom-1;i>top;--i){
                    result[index++] = matrix[i][left];
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        int result[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        mmz.spiralOrder(result);
    }
}
