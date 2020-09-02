package quesiton53_最大子序和;


/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 10:26
 * @Created by mmz
 */
public class Mmz {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length<=0){
            return 0;
        }
        int max = nums[0];
        int result = nums[0];
        for(int i = 1;i<nums.length;++i){
            if(max <0){
                max =nums[i];
            }else{
                max = max+nums[i];
            }
            if(max > result){
                result = max;
            }
        }
        return result;

    }
}
