package jianzhi45_把数组排成最小的数组;

import java.util.Arrays;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/1 21:12
 * @Created by mmz
 */
public class Mmz2 {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i = 0 ;i<nums.length;++i){
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings,((o1, o2) -> (o1+o2).compareTo(o2+o1)));

        StringBuffer stringBuffer = new StringBuffer();
        for(String string:strings){
            stringBuffer.append(string);
        }

        return stringBuffer.toString();
    }
}
