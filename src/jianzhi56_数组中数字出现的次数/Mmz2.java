package jianzhi56_数组中数字出现的次数;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/1 21:30
 * @Created by mmz
 */
public class Mmz2 {
    public int[] singleNumbers(int[] nums) {
        if(nums == null || nums.length <=0){
            return new int[0];
        }

        int count = 0;
        for(int num:nums){
            count ^=num;
        }

        int mask = 1;
        while((count & mask) == 0){
            mask <<=1;
        }

        int a=0,b=0;

        for(int num:nums){
            if((num & mask) == 0){
                a ^=num;
            }else{
                b ^=num;
            }
        }
        return new int[]{a,b};
    }
}
