package jianzhi45_把数组排成最小的数组;

import java.util.Arrays;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 17:47
 * @Created by mmz
 */
public class Mmz1 {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i = 0;i<nums.length;++i){
            strings[i] =String.valueOf(nums[i]) ;
        }

        Arrays.sort(strings,
                (o1, o2) -> (o1+o2).compareTo(o2+o1));

        StringBuffer stringBuffer = new StringBuffer();
        for(String s:strings){
            stringBuffer.append(s);
        }

        return stringBuffer.toString();
    }
}
