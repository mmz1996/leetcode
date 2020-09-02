package jianzhi48_最长不含重复字符的子字符串;

import com.sun.org.glassfish.external.amx.AMX;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 16:51
 * @Created by mmz
 */
public class Mmz1 {
    public int lengthOfLongestSubstring(String s) {
        int res=0,tmp=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i =0;i<s.length();++i) {
            int index = hashMap.getOrDefault(s.charAt(i), -1);
            tmp = i - index > tmp ? tmp + 1 : i - index;
            res = Math.max(res, tmp);
            hashMap.put(s.charAt(i),i);
        }
        return res;
    }

    public static void main(String[] args) {
        Mmz1 mmz1 = new Mmz1();
        System.out.println(mmz1.lengthOfLongestSubstring("abcabcbb"));
    }
}
