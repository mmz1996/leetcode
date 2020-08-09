package jianzhi56_数组中数字出现的次数;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/10 0:59
 * @Created by mmz
 */
public class Mmz {
    public int[] singleNumbers(int[] nums) {
        int k = 0;
        for(int num : nums){
            k = k^num;
        }

        int mask = 1;
        while((mask & k) == 0){
            mask = mask <<1;
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
