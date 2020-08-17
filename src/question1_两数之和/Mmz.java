package question1_两数之和;

import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/17 21:35
 * @Created by mmz
 */
public class Mmz {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length<=0){
            return new int[0];
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{i,hashMap.get(target-nums[i])};
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];
    }
}

