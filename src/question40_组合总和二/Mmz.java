package question40_组合总和二;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 0:42
 * @Created by mmz
 */
public class Mmz {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || candidates.length <=0){
            return lists;
        }

        Arrays.sort(candidates);
        core(candidates,0,target,new ArrayList<>());
        HashSet<List<Integer>> hashSet= new HashSet<>(lists);
        return new ArrayList<>(hashSet);
    }

    public void core(int[] nums,int index,int target,List<Integer> list){
        if(target == 0){
            lists.add(new ArrayList<>(list));
        }

        for(int i = index;i<nums.length;++i){
            if(target-nums[i] <0){
                return;
            }
            list.add(nums[i]);
            core(nums,i+1,target-nums[i],list);
            list.remove(list.size()-1);
        }
    }
}
