package question560_和为k的子数组;

import java.util.HashMap;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/2 23:37
 * @Created by mmz
 */
public class Mmz2 {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length <=0|| k<=0){
            return 0;
        }

        int pre = 0;
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);

        for(int i = 0;i<nums.length;++i){
            pre +=nums[i];

            if(hashMap.containsKey(pre-k)){
                count += hashMap.get(pre-k);
            }

            hashMap.put(pre,hashMap.getOrDefault(pre,0)+1);
        }
        return count;
    }

}
