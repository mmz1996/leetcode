package question338_比特位计数;

import java.util.ArrayList;

/**
 * @Classname Solution1
 * @Description TODO
 * @Date 2020/4/13 13:11
 * @Created by mmz
 */
public class Solution1 {
    public static   int[] countBits(int num) {
        int[] nums = new int[num+1];
        for(int i = 0;i<=num;++i){
            nums[i] = count1(i);
        }
        return nums;
    }
    public static int count1(int num){
        int  count = 0;
        while(num != 0){
            if((num&1) == 1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
}
