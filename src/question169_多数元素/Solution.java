package question169_多数元素;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/7 23:04
 * @Created by mmz
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int result = nums[0];
        for(int i = 1 ;i<nums.length;++i){
            if(count == 0){
                result = nums[i];
                count =1;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return result;
    }
}
