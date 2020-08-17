package question728_自除数;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/15 15:11
 * @Created by mmz
 */
public class Mmz {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left;i<=right ;++i){
            if(core(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean core(int num){
        int result = num;
        while(result != 0){
            int c = result%10;
            result = result/10;
            if(c == 0){
                return false;
            }
            if((num % c)!= 0){
                return false;
            }
        }
        return true;
    }
}
