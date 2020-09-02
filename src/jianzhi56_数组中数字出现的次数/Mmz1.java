package jianzhi56_数组中数字出现的次数;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 18:06
 * @Created by mmz
 */
public class Mmz1 {
    public int[] singleNumbers(int[] nums) {
        if(nums == null || nums.length<=0){
            return new int[0];
        }
        int res = 0;
        for(int num:nums){
            res ^=num;
        }

        int mask = 1;
        while ((mask&res) == 0){
            mask = mask<<1;
        }

        int a = 0;
        int b = 0;
        for(int num:nums){
            if((num & mask) == 0){
                a = a^num;
            }else{
                b = b^num;
            }
        }
        return new int[]{a,b};
    }
}
