package question39_组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 0:37
 * @Created by mmz
 */
public class Mmz1 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length <=0){
            return lists;
        }

        Arrays.sort(candidates);

        core(candidates,0,target,new ArrayList<>());
        return lists;
    }

    public void core(int[] candidates,int index,int target,List<Integer> list){
        if(target == 0){
            lists.add(new ArrayList<>(list));
        }

        for(int i = index;i<candidates.length;++i){
            if(target-candidates[i] <0){
                return;
            }
            list.add(candidates[i]);
            core(candidates,i,target-candidates[i],list);
            list.remove(list.size()-1);
        }
    }
}
