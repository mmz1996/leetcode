package jianzhi21_调整数组顺序使奇数位于偶数前面;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/13 0:27
 * @Created by mmz
 */
public class Mmz {
    public int[] exchange(int[] nums) {
        if(nums == null || nums.length <=0){
            return new int[0];
        }
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            while (start<end && nums[end] %2 ==0){
                end--;
            }
            while (start<end && nums[start] % 2 ==1){
                start++;
            }

            if(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        return nums;
    }
}
