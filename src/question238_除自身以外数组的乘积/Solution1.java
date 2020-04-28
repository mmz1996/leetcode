package question238_除自身以外数组的乘积;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/4/13 13:49
 * @Created by mmz
 */
public class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] =1;
        right[nums.length-1] = 1;
        for(int i = 1;i<nums.length;++i){
            left[i] = left[i-1]*nums[i-1];
        }
        for(int j = nums.length-2;j>=0;--j){
            right[j] = right[j+1]*nums[j+1];
        }
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;++i){
            result[i] = left[i]*right[i];
        }
        return result;
    }
}
