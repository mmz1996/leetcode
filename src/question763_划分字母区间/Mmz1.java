package question763_划分字母区间;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/2 20:32
 * @Created by mmz
 */
public class Mmz1 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        if(S == null || S.length()<=0){
            return list;
        }

        int[] result = new int[26];
        for(int i = 0;i<S.length();++i){
            result[S.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for(int i = 0;i<S.length();++i){
            end = Math.max(end,result[S.charAt(i)-'a']);

            if(end == i){
                list.add(end-start+1);
                start = i+1;
            }
        }


        return list;


    }
}
