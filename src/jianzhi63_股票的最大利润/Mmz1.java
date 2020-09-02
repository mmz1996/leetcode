package jianzhi63_股票的最大利润;

/**
 * @Classname Mmz1
 * @Description TODO
 * @Date 2020/8/26 12:41
 * @Created by mmz
 */
public class Mmz1 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
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
