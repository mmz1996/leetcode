package question338_比特位计数;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Solution
 * @Description 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 * @Date 2020/4/13 11:37
 * @Created by mmz
 */
public class Solution {
    public static   int[] countBits(int num) {
        int[][] dp = new int[num+1][num+1];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ;i<=num;i++){
            list.add(count1(i));
            for(int j = 0 ;j<list.size();++j){
                dp[i][j] = list.get(j);
            }
        }
        return dp[num];
    }
    public static int count1(int num){
        int  count = 0;
        while(num != 0){
            if((num&1) == 1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
}
