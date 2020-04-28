package question39;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/8 18:54
 * @Created by mmz
 */
class Solution {
    static   List<List<Integer>> lists = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null && target <0 || candidates.length<0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Core(0,candidates,target,list);
        return lists;
    }
    public static void Core(int start ,int[] candidates ,int target,List<Integer> list){
        if(target <0){
            return ;
        }else if(target == 0){
            lists.add(new ArrayList<>(list));
        }else{
            for(int i = start;i<candidates.length;++i){
                list.add(candidates[i]);
                Core(i,candidates,target-candidates[i],list);
//                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2,3,6,7},7);
    }
}