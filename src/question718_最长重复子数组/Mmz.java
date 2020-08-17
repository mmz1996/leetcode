package question718_最长重复子数组;

import java.util.HashSet;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 16:05
 * @Created by mmz
 */
public class Mmz {
    public static int findLength(int[] A, int[] B) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i :A){
            hashSet.add(i);
        }
        int max = 0;
        for(int i = 0;i<B.length;++i){ //从B找
            if(hashSet.contains(B[i])){
                for(int j = 0;j<A.length;++j){
                    if(B[i] == A[j]){
                        int count = 0;
                        int indexj = j;
                        int indexi = i;
                        while(indexj<A.length && indexi<B.length && B[indexi] == A[indexj]){
                            indexi++;
                            indexj++;
                            count++;
                        }
                        max = Math.max(max,count);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        findLength(new int[]{1,2,3,2,1},new int[]{3,2,1,4,7});
    }
}
