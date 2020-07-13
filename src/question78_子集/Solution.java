package question78_子集;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/13 22:29
 * @Created by mmz
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null){
            return lists;
        }
        Core(0,new ArrayList(),nums);
        return lists;

    }
    public void Core(int index,List<Integer> list,int[] nums){
        lists.add(new ArrayList(list));
        for(int i = index ;i<nums.length;++i){
            list.add(nums[i]);
            Core(i+1,list,nums);
            list.remove(list.size()-1);
        }
    }
}
