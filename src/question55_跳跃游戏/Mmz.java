package question55_跳跃游戏;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 0:52
 * @Created by mmz
 */
public class Mmz {
    public boolean canJump(int[] nums) {
        for(int i = 0 ;i<nums.length;++i){
            int startindex = i;
            int start = nums[i];
            if(nums[i] == 0){
                break;
            }
            while(start != 0){
                startindex = startindex+start;

                if(startindex>nums.length-1){
                    return true;
                }
                start = nums[startindex];
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Mmz mmz = new Mmz();
        mmz.canJump(new int[]{3,2,1,0,4});
    }
}
