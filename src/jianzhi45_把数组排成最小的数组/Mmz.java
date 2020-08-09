package jianzhi45_把数组排成最小的数组;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Arrays;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 22:29
 * @Created by mmz
 */
public class Mmz {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i = 0;i<nums.length;++i){
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings,((o1, o2) -> {
            return (o1+o2).compareTo(o2+o1);
        }));

        StringBuilder stringBuilder = new StringBuilder();
        for(String s : strings){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
