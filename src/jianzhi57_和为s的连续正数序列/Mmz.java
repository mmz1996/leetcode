package jianzhi57_和为s的连续正数序列;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/9 21:11
 * @Created by mmz
 */
public class Mmz {

    public int[][] findContinuousSequence(int target) {
       int i = 1;
       int j = 1;
       int sum = 0;
       List<int[]> list = new ArrayList<>();

       while(i<=target/2){
           if(sum < target){
               sum +=j;
               j++;
           }else if(sum > target){
               sum -= i;
               i++;
           }else{
               int[] arr = new int[j-i];
               for(int k = i;k<j;++k){
                   arr[k-i] = k;
               }
               list.add(arr);
               sum -=i;
               i++;
           }
       }
       return list.toArray(new int[list.size()][]);
    }
}
