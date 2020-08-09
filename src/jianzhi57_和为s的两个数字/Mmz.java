package jianzhi57_和为s的两个数字;

import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 23:57
 * @Created by mmz
 */
public class Mmz {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length <= 0){
            return new int[0];
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;++i){
            if(hashMap.containsKey(nums[i])){
                return new int[]{nums[i],target-nums[i]};
            }else{
                hashMap.put(target-nums[i] ,nums[i]);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.twoSum(new int[]{2,7,11,15},9);
    }
}
