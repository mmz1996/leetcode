package question3_无重复字符的最长字串;

import java.util.HashMap;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/25 18:52
 * @Created by mmz
 */
public class Mmz1 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()<=0){
            return 0;
        }

        HashMap<Character,Integer> hashmap = new HashMap();
        int tmp = 0;
        int max = 0;
        for(int i = 0;i<s.length();++i){
            int index = hashmap.getOrDefault(s.charAt(i),-1);
            tmp = i-index>tmp?tmp+1:i-index;
            max =Math.max(tmp,max);
            hashmap.put(s.charAt(i),i);
        }

        return max;
    }
}
