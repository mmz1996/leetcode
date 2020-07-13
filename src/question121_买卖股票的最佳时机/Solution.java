package question121_买卖股票的最佳时机;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/12 17:21
 * @Created by mmz
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0;i<prices.length;++i){
            if(prices[i] <min){
                min = prices[i];
            }else if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
