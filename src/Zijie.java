import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Zijie
 * @Description TODO
 * @Date 2020/9/22 14:11
 * @Created by mmz
 * 数组中数字求和得到目标数
 * 给定一个int数组A，数组中元素互不重复，给定一个数x，求所有求和能得到x的数字组合，组合中的元素来自A，可重复使用。
 *
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class Zijie {
    static List<List<Integer>> lists = new ArrayList<>();
    public static List<List<Integer>> core(int[] nums,int target){

        if(nums == null|| nums.length<=0){
            return lists;
        }
        coreNum(nums,target,new ArrayList<>(),0);
        return lists;
    }

    public static void coreNum(int[] nums,int target,List<Integer> list,int index){
        if(target == 0){
            lists.add(new ArrayList<>(list));
            return;
        }

        for(int i =index;i<nums.length;++i){
            if(target-nums[i] < 0){
                break;
            }
            list.add(nums[i]);

            coreNum(nums,target-nums[i],list,i);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5};
        int target = 8;
        core(nums,target);
        for(List<Integer> list:lists){
            for(int i:list){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
