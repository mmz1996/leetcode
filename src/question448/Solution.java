package question448;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/3 14:19
 * @Created by mmz
 */
public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list =new ArrayList<>();
        for(int i = 0;i<nums.length;++i){

            nums[nums[i]-1] = nums.length + nums[nums[i]-1];
        }
        for(int i = 0;i<nums.length;++i){
            if(nums[i] >nums.length){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

}
