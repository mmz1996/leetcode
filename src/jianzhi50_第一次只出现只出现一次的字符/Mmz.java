package jianzhi50_第一次只出现只出现一次的字符;

import java.util.HashMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/10 0:11
 * @Created by mmz
 */
public class Mmz {
    public char firstUniqChar(String s) {
        HashMap<Character,Boolean> hashMap = new HashMap<>();

        for(int i = 0;i<s.length();++i){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),false);
            }else{
                hashMap.put(s.charAt(i),true);
            }
        }
        for(int i = 0;i<s.length();++i){
            if(hashMap.get(s.charAt(i))){
                return s.charAt(i);
            }
        }

        return ' ';
    }
}
