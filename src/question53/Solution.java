package question53;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/2 13:07
 * @Created by mmz
 */
public class Solution {
    public static int maxSubArray(int[] nums) {
        if(nums.length <= 0 || nums == null){
            return 0;
        }
        int max = 0;
        int cur = 0;
        for(int i = 0;i<nums.length;++i){

            if(cur < 0){
                cur = nums[i];
            }else{
                cur = cur +nums[i];
            }
            max = Math.max(max,cur);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
