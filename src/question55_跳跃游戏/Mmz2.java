package question55_跳跃游戏;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/8/21 14:41
 * @Created by mmz
 */
public class Mmz2 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0;i<n;++i){
            if(i<=max){
                max = Math.max(i+nums[i],max);
                if(max >= n-1){
                    return true;
                }
            }

        }
        return false;
    }
}
