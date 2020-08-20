package question15_三数之和;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/18 22:31
 * @Created by mmz
 */
public class Mmz1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0;i<length;++i){
            if (i!=0 && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i]>0){
                return lists;
            }

            int left = i+1;
            int right = length-1;

            int target = -nums[i];
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    lists.add(list);
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum >target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
    }
}
