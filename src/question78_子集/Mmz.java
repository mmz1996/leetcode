package question78_子集;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/1 17:08
 * @Created by mmz
 */
public class Mmz {
    public static List<String> Core(String word){
        List<String> lists = new ArrayList<>();
        int length = word.length();
        for(int i = 0;i<length;++i){
            for(int j = 0;j<length-i;++j){
                String sub = word.substring(i,i+j+1);
                System.out.println(sub);
                lists.add(sub);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        List<String> lists = Core("abcd");
        System.out.println(lists);
    }
}
