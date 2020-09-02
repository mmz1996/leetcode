package question728_自除数;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/9/2 21:12
 * @Created by mmz
 */
public class Mmz1 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;++i){
            if(core(i)){
                list.add(i);
            }
        }
        return list;

    }

    public boolean core(int n){
        int number = n;
        List<Integer> list = new ArrayList<>();
        while(n != 0){

            int k = n%10;
            if(k == 0){
                return false;
            }else{
                list.add(k);
            }
            n = n/10;
        }
        for(int num:list){
            if(number % num != 0){
                return false;
            }
        }

        return true;

    }
}
