package question454_四数相加二;

import javax.lang.model.type.NullType;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/3 0:05
 * @Created by mmz
 */
public class Mmz1 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hashMap  = new HashMap<>();
        int count = 0;
        for(int num:A){
            for(int numb:B){
                int sum = num + numb;

                hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
            }
        }

        for(int c:C){
            for(int d:D){
                int sum = c+d;
                if(hashMap.containsKey(-sum)){
                    count +=hashMap.get(sum);
                }
            }
        }
        return count;
    }
}
