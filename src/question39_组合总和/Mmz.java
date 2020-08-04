package question39_组合总和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/1 19:07
 * @Created by mmz
 */
public class Mmz {
    List<List<Integer>> lists = new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        Core(candidates,target,new ArrayList<>(),0);
        return lists;
    }
    public void Core(int[] candidates, int target, List<Integer> list, int index){
        if(target == 0){
            lists.add(list);
            return ;
        }
        for(int i =index;i<candidates.length;++i){
            if(target-candidates[i] < 0){
                break;
            }
            list.add(candidates[i]);
            Core(candidates,target-candidates[i],list,i);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        System.out.println(mmz.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
