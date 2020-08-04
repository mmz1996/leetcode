import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname question16_最接近的三数之和
 * @Description TODO
 * @Date 2020/7/30 23:00
 * @Created by mmz
 */
public class question16_最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int gap = 10000;
        for(int i = 0 ;i<nums.length;++i){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target){
                    return sum;
                }
                if(Math.abs(sum-target) <Math.abs(gap-target)){
                    gap = sum;
                }
                if(sum <target){
                    left++;
                }
                if(sum > target){
                    right--;
                }

            }
        }
        return gap;
    }
}
