package question347_前k个高频元素;

import java.util.*;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 0:01
 * @Created by mmz
 */
public class Mmz {
    public int[] toKFrequent(int[] nums,int k){
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int n :nums){
            hashMap.put(n,hashMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2) ->hashMap.get(n2)-hashMap.get(n1));

        for(int n:hashMap.keySet()){
            heap.add(n);
        }

        int[] result = new int[k];
        int index = 0;

        while(index<k){
            result[index++] = heap.poll();
        }
        return result;
    }
}
