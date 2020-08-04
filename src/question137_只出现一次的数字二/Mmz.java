package question137_只出现一次的数字二;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/4 23:47
 * @Created by mmz
 */
public class Mmz {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i = i + 3;
            }
        }
        return -1;
    }
}