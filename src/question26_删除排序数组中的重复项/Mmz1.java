package question26_删除排序数组中的重复项;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/20 21:52
 * @Created by mmz
 */
public class Mmz1 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <=0){
            return -1;
        }
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}
