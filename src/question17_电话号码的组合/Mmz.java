package question17_电话号码的组合;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/30 23:06
 * @Created by mmz
 */
public class Mmz {
    List<String> lists = new ArrayList<>();
    HashMap<String,String> hashMap = new HashMap<String,String >(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if(digits != null){
            Core("",digits);
        }
        return lists;
    }

    public void Core(String prenum,String nextnum){
        if(nextnum.length() ==  0){
            lists.add(prenum);
        }else{
            String digit = nextnum.substring(0,1);
            String letters = hashMap.get(digit);
            for(int j = 0;j<letters.length();++j){
                String newnum = prenum+letters.substring(j,j+1);
                Core(newnum,nextnum.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.letterCombinations("23");
    }
}
