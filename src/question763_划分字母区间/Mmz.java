package question763_划分字母区间;

import sun.plugin.javascript.navig.Anchor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 14:30
 * @Created by mmz
 */
public class Mmz {
    public static List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for(int i = 0;i<S.length();++i){
            last[S.charAt(i)-'a'] = i;
        }
        List<Integer> list = new ArrayList<>();

        int start = 0,end = 0;
        for(int i = 0;i<S.length();++i){
            end = Math.max(end,last[S.charAt(i)-'a']);
            if(end == i){
                list.add(end- start+1);
                start =i+1;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");
    }
}
