package question46_全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/13 23:19
 * @Created by mmz
 */
public class Solution {
    List<List<Integer>> lists = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null){
            return lists;
        }
        dfs(0,nums);
        return lists;
    }
    public void dfs(int index , int[] nums){
        if(index == nums.length){
            ArrayList<Integer> list = new ArrayList();
            for(int num:nums){
                list.add(num);
            }
            lists.add(list);
        }
        for(int i = index ;i<nums.length;++i){
            swap(i,index,nums);
            dfs(index+1,nums);
            swap(i,index,nums);
        }
    }
    public void swap(int i ,int index,int[] nums){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
