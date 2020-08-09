package question322_零钱兑换;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 17:52
 * @Created by mmz
 */
public class Mmz {
    List<List<Integer>> lists = new ArrayList<>();
    public int coinChange(int[] coins, int amount) {
        reverse(coins);

        Core(coins,amount,new ArrayList<>());
        if(lists.size() == 0){
            return -1;
        }else{
           return  lists.get(0).size();
        }
    }
    public void reverse(int[] nums){
        int start = 0 ;
        int end = nums.length-1;

        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;

        }
    }

    public void Core(int[] nums,int target,List<Integer> list){
        if(target == 0){
            lists.add(new ArrayList<>(list));
            return;
        }
        if(target <0){
            return;
        }
        for(int i = 0;i<nums.length;++i){
            list.add(nums[i]);
            Core(nums,target-nums[i],list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {

        Mmz mmz = new Mmz();
        System.out.println(mmz.coinChange(new int[]{1, 2, 5}, 11));
    }


}
