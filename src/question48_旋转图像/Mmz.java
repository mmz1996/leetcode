package question48_旋转图像;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/1 19:36
 * @Created by mmz
 */
public class Mmz {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        int count = 0;
        HashMap<String,Integer> hashmap = new HashMap<String ,Integer>();
        for(String string:strs){
            if(!hashmap.isEmpty() && hashmap.containsKey(string)){
                int k = hashmap.get(string);
                lists.get(k).add(string);
            }else{
                List<String> liststring = new ArrayList();
                Core(string,0,liststring);
                for(String strings:liststring){
                    hashmap.put(strings,count);
                }
                count++;
                List<String> result = new ArrayList<>();
                result.add(string);
                lists.add(result);
            }




        }
        return lists;
    }
    public void Core(String a,int index,List<String> liststring){
        if(index == a.length()-1){
            liststring.add(a);
        }
        for(int i = index;i<a.length();++i){
            a =  swap(a,i,index);
            Core(a,index+1,liststring);
            a=  swap(a,i,index);
        }
    }
    public String swap(String a,int i ,int j){
        char[] chars = a.toCharArray();
        char temp = chars[i];
        chars[i] =  chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Mmz mmz =new Mmz();
        String[] strings = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(mmz.groupAnagrams(strings));
    }
}
