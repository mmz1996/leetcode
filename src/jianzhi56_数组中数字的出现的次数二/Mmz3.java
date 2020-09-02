package jianzhi56_数组中数字的出现的次数二;

/**
 * @Classname Mmz3
 * @Description TODO
 * @Date 2020/9/1 21:18
 * @Created by mmz
 */
public class Mmz3 {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length <=0){
            return 0;
        }

        int[] result = new int[32];

        for(int num:nums){
            int mask = 1;
            for(int i =31;i>=0;--i){
                if((num & mask) != 0){
                    result[i]++;
                }
                mask <<=1;
            }
        }

        int res = 0;

        for(int i =0;i<32;++i){
            res <<=1;
            res +=result[i]%3;
        }

        return res;
    }
}
