package question17_电话号码的组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/20 13:35
 * @Created by mmz
 */
public class Mmz1 {
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
      if(digits == null || digits.length()<=0){
          return lists;
      }
      core("",digits);
      return lists;
    }

    public void core(String now,String res){
        if(res.length() == 0) {
            lists.add(now);
        }else{
            String number = res.substring(0,1);
            String letters = hashMap.get(number);

            for(int i = 0;i<letters.length();++i){
                String newletter = now+letters.substring(i,i+1);
                core(newletter,res.substring(1));
            }
        }
    }


}
