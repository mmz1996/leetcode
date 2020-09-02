package question49_字母异位分词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 10:09
 * @Created by mmz
 */
public class Mmz {
    List<List<String>> lists = new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length <=0){
            return lists;
        }

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String string:strs){
            char[] chars = string.toCharArray();
            Arrays.sort(chars);

            String newstring = String.valueOf(chars);

            if(hashMap.containsKey(newstring)){
                lists.get(hashMap.get(newstring)).add(string);
            }else{
                List<String> list = new ArrayList<>();
                list.add(string);
                hashMap.put(newstring,list.size());
            }
        }
        return lists;
    }
}
