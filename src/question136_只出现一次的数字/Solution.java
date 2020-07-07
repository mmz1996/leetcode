package question136_只出现一次的数字;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/7/7 22:49
 * @Created by mmz
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        for(int i :nums){
            count ^=i;
        }
        return count;
    }
}
