package jianzhi48_最长不含重复字符的子字符串;

import java.sql.ResultSet;
import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 19:09
 * @Created by mmz
 */
public class Mmz {
    public int lengthOfLongestSubstring(String s) {
        int res=0,tmp = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<s.length();++i){
            int j = hashMap.getOrDefault(s.charAt(i),-1);
            hashMap.put(s.charAt(i),i);
            tmp = tmp <i-j?tmp+1:i-j;
            res = Math.max(res,tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.lengthOfLongestSubstring("bbbbb"));
    }
}
