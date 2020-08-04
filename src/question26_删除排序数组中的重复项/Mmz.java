package question26_删除排序数组中的重复项;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/7/31 0:04
 * @Created by mmz
 *
 * 112223333
 */
public class Mmz {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <=0){
            return 0;
        }
        int i = 0;
        for(int j = 0 ;j<nums.length;++j){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
