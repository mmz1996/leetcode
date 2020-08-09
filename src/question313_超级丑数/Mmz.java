package question313_超级丑数;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/8 16:48
 * @Created by mmz
 */
public class Mmz {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int length = primes.length;
        int[] dp = new int[n];
        int[] index = new int[length];
        dp[0]= 1;

        for(int i =1;i<n;++i){
            int min = Integer.MAX_VALUE;

            for(int j = 0;j<length;++j){
                if(min > primes[j] *dp[index[j]]){
                    min = primes[j] * dp[index[j]];
                }
            }
            dp[i] = min;

            for(int j = 0;j<length;++j){
                if(min == primes[j] * dp[index[j]]){
                    index[j]++;
                }
            }
        }
        return dp[n-1];
    }
}
