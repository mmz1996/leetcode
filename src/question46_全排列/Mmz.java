package question46_全排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 0:46
 * @Created by mmz
 */
public class Mmz {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length <=0){
            return lists;
        }

        core(nums,0);
        return lists;
    }

    public void core(int[] nums,int index){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            System.out.println("我要把一下元素加入到lists中");
            for(int i :nums){
                System.out.print(i);
                list.add(i);
            }
            System.out.println("结束了");
            lists.add(list);

        }

        for(int i = index;i<nums.length;++i){
            swap(nums,i,index);
            core(nums,index+1);
            swap(nums,i,index);
        }
    }

    public void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        Mmz mmz =new Mmz();
        mmz.core(new int[]{1,2,3},0);
    }
}
