package jianzhi56_数组中数字的出现的次数二;

import java.util.HashSet;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/10 1:10
 * @Created by mmz
 */
public class Mmz {
    public int singleNumber(int[] nums) {

        long result = 0;
        HashSet<Long> hashSet = new HashSet<>();

        for(long num:nums){
            if(hashSet.contains(num)){
                result -=num;
            }else{
                hashSet.add(num);
                result +=num<<1;
            }
        }
        return (int)result/2;
    }
}
