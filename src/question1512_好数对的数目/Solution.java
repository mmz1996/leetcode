package question1512_好数对的数目;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/13 23:59
 * @Created by mmz
 */
public class Solution {
    public  static int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> hashmap = new HashMap();
        for(int i = 0 ;i<nums.length;++i){
            if(hashmap.containsKey(nums[i])){
                count +=hashmap.get(nums[i]);
                hashmap.put(nums[i],hashmap.get(nums[i])+1);
            }else{
                hashmap.put(nums[i],1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,1,1,3};
//        System.out.println(numIdenticalPairs(nums));
        List list=  new ArrayList();
        while(true){
            list.add(new Object());
        }
    }
}
