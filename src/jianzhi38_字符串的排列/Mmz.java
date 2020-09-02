package jianzhi38_字符串的排列;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/9/2 18:19
 * @Created by mmz
 */
public class Mmz {
    HashSet<String> hashSet = new HashSet<>();
    public String[] permutation(String s) {
        if(s == null && s.length()<=0){
            return new String[0];
        }
        core(s.toCharArray(),0);
        List<String> list = new ArrayList<>(hashSet);
        String[] strings = new String[list.size()];
        for(int i = 0;i<list.size();++i){
            strings[i] = list.get(i);
        }

        return strings;

    }

    public void core(char[] chars,int index){
        if(index == chars.length-1){
            hashSet.add(new String(chars));
        }

        for(int i = index;i<chars.length;++i){
            swap(chars,i,index);
            core(chars,i+1);
            swap(chars,i,index);
        }
    }


    public void swap(char[] chars,int start,int end){
        char tmp = chars[start];
        chars[start] = chars[end];
        chars[end] = tmp;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.permutation("abc");
    }
}
