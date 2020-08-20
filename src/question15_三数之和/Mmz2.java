package question15_三数之和;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/8/18 23:15
 * @Created by mmz
 */
public class Mmz2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length<=2){
            return lists;
        }

        Arrays.sort(nums);

        for(int i = 0;i<nums.length;++i){
            if(nums[i] >0){
                return lists;
            }
            if(i >0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            int target = -nums[i];

            while(left<right){
                if(nums[left] + nums[right] == target){
                    lists.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while(left<right && nums[right] ==nums[right+1]){
                        right--;
                    }
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                }else if(nums[left] + nums[right] > target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return lists;
    }
}
