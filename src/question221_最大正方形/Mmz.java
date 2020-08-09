package question221_最大正方形;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/6 23:00
 * @Created by mmz
 */
public class Mmz {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length <=0 || matrix[0].length <=0){
            return 0;
        }
        int max = 0;
        for(int i = 0 ;i<matrix.length;++i){
            for(int j = 0;j<matrix[0].length;++j){
                if(matrix[i][j] == '1'){
                    int temp = Core(matrix,i,j,matrix.length,matrix[0].length);
                    if(temp > max){
                        max = temp;
                    }
                }
            }
        }
        return max*max;
    }
    public int Core(char[][] matrix,int i,int j,int row,int col){
        if( i>=0 && i<row && j >=0 && j<col && matrix[i][j] == '1'){
            int temp = 1;
            boolean flag = true;
            while(flag){
                for(int k = i;k<= i+temp;++k){
                    for(int q = j;q<=j+temp;++q){
                        if (!CoreDFS(matrix,k,q,row,col)){
                            return temp;
                        }
                    }
                }
                temp++;
            }
        }
        return -1;
    }

    public boolean CoreDFS(char[][] matrix,int i,int j,int row,int col){
        if( i>=0 && i<row && j >=0 && j<col && matrix[i][j] == '1'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.maximalSquare(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}));
    }
}
