package question46_全排列;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/21 22:34
 * @Created by mmz
 */
public class Mmz1 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length<=0){
            return lists;
        }

        core(nums,0);
        return lists;
    }

    public void core(int[] nums,int index){
        if(index == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for (int i :nums){
                list.add(i);
            }
            lists.add(list);
        }

        for(int i = index;i<nums.length;++i){
            swap(nums,i,index);
            core(nums,index+1);
            swap(nums,i,index);
        }
    }

    public void swap(int[] nums,int i,int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
