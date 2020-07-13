package question1_两数之和;

import java.util.HashMap;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 19:19
 * @Created by mmz
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;++i){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }
        return null;
    }
}
