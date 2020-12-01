package question91_解码方法;

/**
 * @Classname Mmz2
 * @Description TODO
 * @Date 2020/9/27 18:50
 * @Created by mmz
 */
public class Mmz2 {
    public int numDecoding(String s){
        if(s == null || s.length()<=0){
            return 0;
        }
        char[] chars = s.toCharArray();

        if(chars[0] == '0'){
            return 0;
        }

        int[] dp = new int[s.length()];

        dp[0] = 1;
        for(int i =1;i<dp.length;++i){
            if(chars[i] != '0'){
                dp[i] = dp[i-1];
            }

            int num = 10*(chars[i-1]-'0')+(chars[i]-'0');
            if(num >=10 && num <=26){
                if(i == 1){
                    dp[i]++;
                }else{
                    dp[i] +=dp[i-1];
                }
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        Mmz2 mmz2 = new Mmz2();
        mmz2.numDecoding("226");
    }
}
