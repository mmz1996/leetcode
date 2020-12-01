package question26_删除排序数组中的重复项;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/27 16:09
 * @Created by mmz
 */
public class Mmz2 {
    public int[] removeDuplicates(int[] nums) {
        List<Integer> lists = new ArrayList<>();
        for(int i = 0;i<nums.length;++i){
            if(core(nums[i])){
                lists.add(nums[i]);
            }
        }

        int[] result = new int[lists.size()];
        for(int i =0;i<result.length;++i){
            result[i] = lists.get(i);
        }

        return result;
    }
    public boolean core(int num){
        for(int i =2;i<=num/2;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Mmz2 mmz2 = new Mmz2();
        int[] result =  mmz2.removeDuplicates(new int[]{3,5,11,12});
        System.out.print("[");
        for(int i =0;i<result.length;++i){
            if(i == result.length-1){
                System.out.print(result[i]);
            }else{
                System.out.print(result[i]+",");
            }
        }
        System.out.print("]");

    }
}
