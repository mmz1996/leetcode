package question46_全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmx
 * @Description TODO
 * @Date 2020/8/1 16:52
 * @Created by mmz
 */
public class Mmx {
    public static void main(String[] args) {
        Core("","abcd",0);
        System.out.println(lists);
    }
    static List<String> lists = new ArrayList<>();
    public static void Core(String a,String b,int index){
        lists.add(a);
        String newletter = "";
        for(int i = index ;i<b.length();++i){
             newletter = a+b.substring(i,i+1);
            Core(newletter,b.substring(1),i);
            newletter = newletter.substring(0,newletter.length()-1);
        }
    }
}
