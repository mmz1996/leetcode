package jianzhi56_数组中数字的出现的次数二;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/10 1:24
 * @Created by mmz
 */
public class Mmz1 {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length <=0){
            return 0;
        }

        int result[] = new int[32];
        int res = 0;
        for(int num:nums){
            int mask = 1;
            for(int i =31;i>=0;i--){
                if((num & mask) != 0){
                    result[i]++;
                }
                mask = mask<<1;
            }
        }
        for(int i =0;i<32;++i){
            res = res<<1;
            res +=result[i]%3;
        }

        return res;
    }

}
