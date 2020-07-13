package question22_括号生成;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/13 23:38
 * @Created by mmz
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        if(n<=0){
            return list;
        }
        Core("",n,n,list);
        return list;
    }
    public void Core(String string, int left, int right, List<String> lists){
        if(left == 0 && right ==0){
            lists.add(string);
            return;
        }
        if(left >right){
            return;
        }
        if(left > 0){
            Core(string+ "(",left-1,right,lists);
        }
        if(right > 0){
            Core(string+ ")",left,right-1,lists);
        }
    }
}
