package question49_字母异位分词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/13 13:19
 * @Created by mmz
 */
class Solution {
    List<List<String>> lists = new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length <=0){
            return lists;
        }
        int count = 0;
        HashMap<String,Integer> hashmap = new HashMap<>();
        for(int i = 0;i<strs.length;++i){
            String string = strs[i];
            char[] nowchar = string.toCharArray();
            Arrays.sort(nowchar);
            String target = new String(nowchar);
            if(hashmap.containsKey(target)){
                int index = hashmap.get(target);
                lists.get(index).add(string);
            }else{
                hashmap.put(target,count++);
                List<String> list = new ArrayList<>();
                list.add(string);
                lists.add(list);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"eat","tea","tan","ate","nat","bat"};
        Solution solution = new Solution();
        solution.groupAnagrams(strings);
    }
}