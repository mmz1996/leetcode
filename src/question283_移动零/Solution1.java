package question283_移动零;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/7/8 23:20
 * @Created by mmz
 */
public class Solution1 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0;i<nums.length;++i){
            if(nums[i] != 0){
                if(i != j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
