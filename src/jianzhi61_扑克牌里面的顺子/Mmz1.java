package jianzhi61_扑克牌里面的顺子;

import java.util.Arrays;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 12:55
 * @Created by mmz
 */
public class Mmz1 {
    public static boolean isStraight(int[] nums) {
        if(nums == null || nums.length <=0){
            return false;
        }
        int gaps = 0;
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;++i){
            if(nums[i] == 0){
                count++;
            }else{
                if(nums[i+1] == nums[i]){
                    return false;
                }else{
                    gaps += nums[i+1]- nums[i]-1;
                }

            }
        }

        return count >=gaps;
    }

    public static void main(String[] args) {

        isStraight(new int[]{10,11,0,12,6});
    }
}
