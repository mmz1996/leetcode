package question560_和为k的子数组;

import java.util.HashMap;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/15 21:37
 * @Created by mmz
 */
public class Mmz1 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int pre = 0;
        int count = 0;
        hashMap.put(0,1);
        for(int i = 0;i<nums.length;++i){
            pre +=nums[i];
            if(hashMap.containsKey(pre-k)){
                count+= hashMap.get(pre-k);
            }
            hashMap.put(pre,hashMap.getOrDefault(pre,0)+1);
        }

        return  count;

    }
}
