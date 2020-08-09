package jianzhi61_扑克牌里面的顺子;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 16:46
 * @Created by mmz
 */
public class Mmz {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int gap = 0 ;
        for(int i = 0;i<nums.length-1;++i){
            if(nums[i] == nums[i+1] && nums[i] != 0){
                return false;
            }
            if(nums[i] == 0){
                gap--;
            }else{
                gap +=nums[i+1]-nums[i]-1;
            }
        }
        return gap <=0;
    }
}
