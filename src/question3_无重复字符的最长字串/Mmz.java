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
        int max = 0;
        HashSet<Character> hashSet =new HashSet<>();
        for(int i = 0;i<s.length();++i){
            if(i !=0){
                hashSet.remove(chars[i-1]);
            }

            while(left+1<s.length() && !hashSet.contains(chars[left+1])){
                hashSet.add(chars[left+1]);
                left++;
            }

            if(left-i+1>max){
                max = left-i+1;
            }
        }
        return max;
    }
}
