package question412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 12:36
 * @Created by mmz
 */
public class Mmz {
    public List<String> fizzBuzz(int n) {
        List<String> lists = new ArrayList<>();
        int index = 1;
        while(n>=index){
            if(index % 3 == 0 && index % 5 == 0) {
                lists.add("FizzBuzz");
            }else if(index % 3== 0){
                lists.add("Fizz");
            }else if (index % 5 == 0){
                lists.add("Buzz");
            }else{
                lists.add(String.valueOf(index));
            }
        }
        return lists;
    }
}
