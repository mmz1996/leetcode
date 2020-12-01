package question91_解码方法;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/10/14 14:50
 * @Created by mmz
 */
class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length()<=0){
            return 0;
        }

        char[] chars = s.toCharArray();

        int[] dp = new int[s.length()];
        dp[0] = 1;

        if(chars[0] == '0'){
            return 0;
        }

        for(int i = 1;i<chars.length;++i){
            dp[i] = dp[i-1];
            int temp = 10 *(chars[i-1]-'0') + chars[i]-'0';
            if(temp <=26 && temp >=10){
                if(i == 1){
                    dp[i] = dp[i-1]+1;
                }else{
                    dp[i] +=dp[i-2];
                }
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.numDecodings("226");
    }
}
