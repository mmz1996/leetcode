package jianzhi03_数组中重复的数字;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/12 23:12
 * @Created by mmz
 */
public class Mmz {
    public int findRepeatNumber(int[] nums) {
        if(nums == null || nums.length <=0){
            return -1;
        }

        for(int i = 0;i<nums.length;++i){
            if(nums[i] == nums[nums[i]] && nums[i] != i){
                return nums[i];
            }
            while(nums[i] != nums[nums[i]]){
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
    }
}
