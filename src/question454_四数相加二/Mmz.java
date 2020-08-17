package question454_四数相加二;

import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/16 14:03
 * @Created by mmz
 */
public class Mmz {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0 ;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int a :A){
            for(int b:B){
                int sum = a+b;
                hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
            }
        }

        for(int c:C){
            for(int d:D){
                int sum2 = c+d;
                if(hashMap.containsKey(-sum2)){
                    result +=hashMap.get(-sum2);
                }
            }
        }

        return result;
    }
}
