package question78;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/9 14:19
 * @Created by mmz
 */
public class Solution {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Core(0,nums,list,new ArrayList());
        return list;
    }
    public static void Core(int index, int[] nums, List<List<Integer>> list, ArrayList<Integer> temp){
        list.add(new ArrayList(temp));
        for(int i = index;i<nums.length;++i){
            temp.add(nums[i]);
            Core(i+1,nums,list,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
}
