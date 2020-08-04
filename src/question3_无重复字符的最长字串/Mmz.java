package question3_无重复字符的最长字串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 22:07
 * @Created by mmz
 */
public class Mmz {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int left =-1;
        Set<Character> set = new HashSet<>();
        int max= 0 ;

        for(int i = 0 ;i<s.length();++i){
            if(i != 0){
                set.remove(chars[i-1]);
            }
            while(left+1<s.length() && !set.contains(chars[left+1])){
                set.add(chars[left+1]);
                left++;
            }
            if(max <left-i+1){
                max = left-i+1;
            }
        }
        return max;
    }
}
