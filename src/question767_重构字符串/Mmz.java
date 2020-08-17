package question767_重构字符串;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 12:21
 * @Created by mmz
 */
public class Mmz {
    public String reorganizeString(String S) {
        int length = S.length();
        int[] counts = new int[26];
        for(Character character :S.toCharArray()){
            counts[character-'a'] +=100;
        }
        for(int i = 0;i<26;++i){
            counts[i] +=i;
        }
        Arrays.sort(counts);

        int index = 1;
        char[] result = new char[length];
        for(int i:counts){
            int count = i/100;
            char now = (char)('a'+(i%100));
            if(count>(length+1)/2){
                return "";
            }

            for(int j=0;j<count;++j){
                if(index>=length){
                    index = 0;
                }
                result[index] = now;
                index +=2;
            }
        }
        return String.valueOf(result);
    }
}
