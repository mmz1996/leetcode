package question15_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:54
 * @Created by mmz
 */
public class Mmz {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<=2){
            return lists;
        }
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length;++i){
            if(nums[i] >0){
                return lists;
            }

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right =nums.length-1;
            int target = -nums[i];
            while(left < right){
                if(nums[left]+ nums[right] == target){
                    lists.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(nums[left] +nums[right] >target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return lists;
    }
}
