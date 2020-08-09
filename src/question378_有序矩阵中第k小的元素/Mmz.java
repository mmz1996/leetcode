package question378_有序矩阵中第k小的元素;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 12:06
 * @Created by mmz
 */
public class Mmz {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];

        while(left<right){
            int mid = (left+right)/2;
            if(Core(matrix,mid,k,n)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean Core(int[][] matrix,int mid ,int k ,int n){
        int i = n-1;
        int j = 0;
        int num = 0 ;
        while(i >= 0 && j<n){
            if(matrix[i][j] <= mid){
                num +=i+1;
                j++;
            }else{
                i--;
            }
        }
        return num >= k;
    }
}
