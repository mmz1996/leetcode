package question55;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/9 17:04
 * @Created by mmz
 */
public class Solution {

    public static boolean canJump(int[] nums) {
        int length = nums.length;
        boolean[] dp = new boolean[length];
        dp[0] = true;
        for(int i = 0 ;i<length;++i){
            if(dp[i] == true){
                int k = nums[i];
                int q =1 ;
                while(k !=0){
                    if(k+1 <length){
                        dp[i+q] = true;
                        k--;
                        q++;
                    }else{
                        return true;
                    }
                }
            }
        }
        return dp[length-1];
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }
}
