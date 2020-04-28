package question283;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/3 0:35
 * @Created by mmz
 */
public class Solution {
        public  static void moveZeroes(int[] nums) {
            int index0 = 0;
            int index = 0;
            for(int i = 0;i<nums.length;++i){
                if(nums[i] == 0){
                    index0 =i;
                    break;
                }
            }
            for(index = index0;index<nums.length;++index){
                if(nums[index] != 0){
                    break;
                }
            }
            while(index0>=0 && index0<nums.length && index>=0&&index+1<nums.length){
                int temp = nums[index0];
                nums[index0] = nums[index];
                nums[index] =nums[index0];
                index0 = index0+1;
                index = index0;
                while(index+1<nums.length && nums[index] == 0){
                    index++;
                }
            }
        }

    public static void main(String[] args) {
        moveZeroes(new int[]{1,0});
    }
}
