package question16_最接近的三数之和;

import org.omg.CORBA.MARSHAL;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/18 23:32
 * @Created by mmz
 */
public class Mmz {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length<=2){
            return 0;
        }
        Arrays.sort(nums);
        int result = 10000;
        for(int i = 0;i<nums.length;++i){
            if(i >0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    return sum;
                }
                if(Math.abs(sum-target) < Math.abs(result-target)){
                    result = sum;
                }
                if(sum < target){
                    left++;
                }
                if(sum > target){
                    right--;
                }
            }
        }
        return result;
    }
}
