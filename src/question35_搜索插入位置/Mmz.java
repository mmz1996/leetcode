package question35_搜索插入位置;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/21 0:19
 * @Created by mmz
 */
public class Mmz {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length<=0){
            return -1;
        }
        for(int i = 0 ;i<0;++i){
            if(target <=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
